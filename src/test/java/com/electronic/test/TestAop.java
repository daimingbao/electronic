package com.electronic.test;

import com.electronic.service.aop.AopService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dmb
 * @since 2019/1/29
 */
public class TestAop {

    private Logger log = LoggerFactory.getLogger("TEST-AOP");

    @Test
    public void aopTest() {

        ApplicationContext context = new ClassPathXmlApplicationContext("/application-aop.xml");

        AopService aopService = context.getBean("aopServiceImpl", AopService.class);

        log.info("{}", aopService);

        aopService.aopTest();
    }

}
