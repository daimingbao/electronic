package com.electronic.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.electronic.dto.req.GenerateOrderReq;
import com.electronic.dto.req.QryOrderDetailReq;
import com.electronic.dto.res.QryOrderDetailRes;
import com.electronic.model.OrderAddr;
import com.electronic.model.OrderItem;
import com.electronic.model.Orders;
import com.electronic.model.OrdersKey;
import com.electronic.model.UserInfo;
import com.electronic.service.OrderAddrService;
import com.electronic.service.OrderItemService;
import com.electronic.service.OrdersService;
import com.electronic.service.UserInfoService;
@Controller
@RequestMapping("/orders")
public class OrdersController {
    
    private Logger LOG = LoggerFactory.getLogger(OrdersController.class);
    
    /**
     * The string redis template.
     */
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
	
	@Autowired
	private OrdersService ordersService;
	
    @Autowired
    private OrderAddrService orderAddrService;
	
	@Autowired
	private OrderItemService orderItemService;
	
	@Autowired
	private UserInfoService userInfoService;

    @RequestMapping("/deleteByPrimaryKey")
    @ResponseBody
	public int deleteByPrimaryKey(OrdersKey key) {
		return ordersService.deleteByPrimaryKey(key);
	}

    @RequestMapping("/insertSelective")
    @ResponseBody
	public int insertSelective(Orders record) {
		return ordersService.insertSelective(record);
	}

    @RequestMapping("/selectByPrimaryKey")
    @ResponseBody
	public Orders selectByPrimaryKey(OrdersKey key) {
		return ordersService.selectByPrimaryKey(key);
	}
    
    @RequestMapping("/qryOrderDetail")
    @ResponseBody
    public QryOrderDetailRes qryOrderDetail(QryOrderDetailReq req) {
        return ordersService.qryOrderDetail(req);
    }
    
    
    @RequestMapping("/qryOrderDymic")
    @ResponseBody
    public QryOrderDetailRes qryOrderDymic(QryOrderDetailReq req) {
        ValueOperations<String, String> valOps = stringRedisTemplate.opsForValue();
        String key = "order:"+req.getOrder_id_pos()+":"+req.getRequest_num();
        String cache = valOps.get(key);
        QryOrderDetailRes res;
        if(StringUtils.isNotBlank(cache)){
            //使用缓存
            LOG.info("使用了缓存:{}",req);
            res = JSON.parseObject(cache, QryOrderDetailRes.class);
        }else{
            res = ordersService.qryOrderDetail(req);
            if(res != null && res.getList().size() == req.getRequest_num()){
                valOps.set(key, JSON.toJSONString(res), 10, TimeUnit.MINUTES);
            }
        }
        return res;
    }
    
    /**
     * 生成订单.
     * @param req
     * @return
     */
    @RequestMapping("/generateOrder")
    @ResponseBody
    public Map<String,Object> generateOrder(GenerateOrderReq req) {
        Map<String,Object> map = new HashMap<String,Object>();
        String msg = "提交订单失败";
        boolean isSuccess =false;
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(req, userInfo);
        //生成用户编号
        StringBuilder userIdSb = new StringBuilder();
        String userId = userIdSb.append("U").append(System.currentTimeMillis()).toString();
        userInfo.setUser_id(userId);
        //生成用户信息
        int r = userInfoService.insertSelective(userInfo );
        if(r ==1 ){
            //生成订单编号
            StringBuilder orderIdSb = new StringBuilder();
            String orderId = orderIdSb.append("O").append(System.currentTimeMillis()).toString();
            Orders orders = new Orders();
            BeanUtils.copyProperties(req, orders);
            orders.setOrder_id(orderId);
            orders.setUser_id(userId);
            orders.setOrder_time(new Date());
            int count = ordersService.insertSelective(orders );
            if(count == 1){
                OrderItem orderItem = new OrderItem();
                BeanUtils.copyProperties(req, orderItem);
                orderItem.setOrderId(orderId);
                OrderAddr orderAddr = new OrderAddr();
                BeanUtils.copyProperties(req, orderAddr);
                StringBuilder addressIdSb = new StringBuilder();
                String addrId = addressIdSb.append("AD").append(System.currentTimeMillis()).toString();
                orderAddr.setAddr_id(addrId);
                orderAddr.setOrder_id(orderId);
                orderAddr.setDetail_addr(req.getAddress());
                orderAddrService.insertSelective(orderAddr );
                int result = orderItemService.insertSelective(orderItem );
                if(result > 0){
                    isSuccess = true;
                    msg = "提交订单成功";
                }
            }
        }
       
        //生成订单信息
        map.put("success", isSuccess);
        map.put("msg", msg);
        //返回结果
        return map;
    }

    @RequestMapping("/updateByPrimaryKeySelective")
    @ResponseBody
	public int updateByPrimaryKeySelective(Orders record) {
		return ordersService.updateByPrimaryKeySelective(record);
	}

}
