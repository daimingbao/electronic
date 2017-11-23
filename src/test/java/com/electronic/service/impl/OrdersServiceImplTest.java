/**
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: </p>
 */
package com.electronic.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.electronic.dto.req.QryOrderDetailReq;
import com.electronic.service.OrdersService;

/**
 * .
 * 
 * @author daimb17192
 * @date 2017年11月23日 下午12:51:54
 * @since 1.0
 */
public class OrdersServiceImplTest extends BaseTest{
    
    @Autowired
    private OrdersService ordersService;

    @Test
    public void testQryOrderDetail(){
        QryOrderDetailReq req = new QryOrderDetailReq();
        
        this.log(ordersService.qryOrderDetail(req ), this.getClass());
    }

}
