package com.electronic.design.pattern.singleton;

/**
 * @author dmb
 * @since 2019/1/23
 */
public class MethodSynchronizedSingleton {

    private static MethodSynchronizedSingleton singleton;

    private MethodSynchronizedSingleton() {}

    /**
     * 在获取单例的方法上加锁，影响效率
     * @return
     */
    public static synchronized MethodSynchronizedSingleton getInstance() {
        if (singleton == null) {
            singleton = new MethodSynchronizedSingleton();
        }
        return singleton;
    }

}
