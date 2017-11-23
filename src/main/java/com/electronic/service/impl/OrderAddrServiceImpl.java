/**
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: 杭州恒生电子股份有限公司</p>
 */
package com.electronic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronic.dao.OrderAddrMapper;
import com.electronic.model.OrderAddr;
import com.electronic.service.OrderAddrService;

/**
 * .
 * 
 * @author daimb17192
 * @date 2017年11月23日 下午1:06:22
 * @since 1.0
 */
@Service
public class OrderAddrServiceImpl implements OrderAddrService {
    
    @Autowired
    private OrderAddrMapper orderAddrMapper;

    @Override
    public int insert(OrderAddr record) {
        return orderAddrMapper.insert(record);
    }

    @Override
    public int insertSelective(OrderAddr record) {
        return orderAddrMapper.insertSelective(record);
    }

}
