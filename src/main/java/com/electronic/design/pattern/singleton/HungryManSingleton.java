package com.electronic.design.pattern.singleton;

/**
 * @author dmb
 * @since 2019/1/23
 */
public class HungryManSingleton {

    /**
     * 类加载就将单例对象初始化，可能导致资源浪费
     */
    private static HungryManSingleton singleton = new HungryManSingleton();

    private HungryManSingleton() {}

    public static HungryManSingleton getInstance() {
        return singleton;
    }
}
