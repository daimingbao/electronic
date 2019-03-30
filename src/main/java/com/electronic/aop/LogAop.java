package com.electronic.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author dmb
 * @since 2019/1/29
 */
public class LogAop {

    private Logger logger = LoggerFactory.getLogger("LOG-AOP");

    public void log() {

        logger.info("日志切面,打印日志");

    }

}
