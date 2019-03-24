package com.electronic.service.impl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SynchronizedTest {


    public static void main(String[] args) throws InterruptedException {
        SynchronizedTest synchronizedTest = new SynchronizedTest();
        //调用同步代码块方法
        synchronizedTest.synchronizedTest(0);
    }

    public void synchronizedTest(int b) throws InterruptedException {
        synchronized (this) {
            String threadName = Thread.currentThread().getName();
            log.info("线程{},{}获得锁", threadName, b);
            //递归调用，用于模拟同一个线程获取同一个对象的锁
            synchronizedTest(++b);
            log.info("线程;{},{}释放锁", threadName, b);
        }
    }

}
