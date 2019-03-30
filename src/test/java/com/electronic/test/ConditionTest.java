package com.electronic.test;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author dmb
 * @since 2019/3/11
 */
public class ConditionTest {

    public static void main(String[] args) {
        ConditionRunnale conditionRunnale = new ConditionRunnale();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i=0; i<3; i++) {
                        conditionRunnale.add();
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i< 3; i++) {
                    conditionRunnale.sub();
                }
            }
        }).start();

    }

}

@Slf4j
class ConditionRunnale {

    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();

    private Condition conditionb = lock.newCondition();

    private static int a = 0;

    public void add() throws InterruptedException {
        lock.lock();
        try {
            if (a > 4) {
                condition.await();
            }
            a ++;
            log.info("{}", a);
        } finally {
            lock.unlock();
        }

    }

    public void sub() {
        lock.lock();
        try {
            if (a > 4) {
                conditionb.await();
            }
            a --;
            log.info("{}", a);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


}

