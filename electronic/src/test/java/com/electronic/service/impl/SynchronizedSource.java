package com.electronic.service.impl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SynchronizedSource {

    public static void main(String[] args) {
        test();
    }

    public static synchronized  void test() {
        Object[] objects = new Object[1];
        int length = objects.length;
        Object o = new Object() ;
        log.info("{}", o instanceof  Object);
        synchronized (SynchronizedTest.class) {
            log.info("{}获得了锁", Thread.currentThread().getName());

        }



    }

}
