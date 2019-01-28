package com.electronic.design.pattern.singleton;

/**
 * @author dmb
 * @since 2019/1/23
 */
public class SimpleSingleton {

    private static SimpleSingleton singleton;

    private SimpleSingleton() {
    }

    /**
     * 获取实例  不考虑并发访问的情况没问题
     * @return
     */
    public static SimpleSingleton getInstance() {
        if (singleton == null) {
            singleton = new SimpleSingleton();
        }
        return singleton;
    }

}
