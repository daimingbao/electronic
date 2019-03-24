package com.electronic.service.impl;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class CASTest {

    private static volatile int a = 0;
    private static volatile AtomicInteger b = new AtomicInteger(0);

    public static void increaseA() {
        a++;
    }

    public static void increaseB() {
        b.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {
        int[] threads = new int[20];
        for (int thread : threads) {
            new Thread(() -> {
                for (int i = 0; i < 10000; i++) {
                    increaseA();
                    increaseB();
                }
            }).start();
        }
        Thread.sleep(2000);
        log.info("a:{}", a);
        log.info("b:{}", b);
    }

}
