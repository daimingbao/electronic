package com.electronic.service.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author dmb
 * @since 2019/1/29
 */
@Service
public class AopServiceImpl implements AopService {

    Logger log = LoggerFactory.getLogger("AOP-SERVICE");

    @Override
    public void aopTest() {

        log.info("我在执行目标方法");

    }
}
