package com.electronic.service.impl;
/**
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: </p>
 */


import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

/**
 * 单元测试 .
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application.xml" })
public class BaseTest {

    public static  Logger LOG =  LoggerFactory.getLogger(BaseTest.class);

    public void log(Object obj,@SuppressWarnings("rawtypes") Class clazz){
        if(null != clazz){
            LOG =  LoggerFactory.getLogger(clazz);
        }
        LOG.info(JSON.toJSONString(obj));
    }
    
    public void log(Object obj){
        LOG.info(JSON.toJSONString(obj));
    }

}
