package com.electronic.service.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;

@Data
@Slf4j
public class MultSynchronizedTest {

    private static Object lockObj;

    private static CountDownLatch countDownLatch = new CountDownLatch(2);

    public static void main(String[] args) {
        lockObj = new Object();
        MyRunnable myRunnable =  new MyRunnable();
//        MyRunnable myRunnable1 =  new MyRunnable();

        new Thread(myRunnable).start();
        new Thread(myRunnable).start();

    }

    @Data
    @AllArgsConstructor
    private static class MyRunnable implements Runnable {
        @Override
        public void run() {
            log.info("{}开始获取锁", Thread.currentThread().getName());
            countDownLatch.countDown();
            synchronized(MyRunnable.class) {
                log.info("{}获得了锁", Thread.currentThread().getName());
                try {
                    Thread.sleep(10000l);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
