/**
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: </p>
 */
package com.electronic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.electronic.model.OrderAddr;
import com.electronic.service.OrderAddrService;

/**
 * .
 * 
 * @author daimb17192
 * @date 2017年11月23日 下午1:06:22
 * @since 1.0
 */
@Controller
@RequestMapping("/orderAddr")
public class OrderAddrController {
    
    @Autowired
    private OrderAddrService orderAddrService;
    
    @RequestMapping("/insertSelective")
    @ResponseBody
    public int insertSelective( OrderAddr record) {
       
        return orderAddrService.insertSelective(record);
    }


}
