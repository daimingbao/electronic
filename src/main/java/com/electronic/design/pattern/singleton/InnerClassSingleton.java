package com.electronic.design.pattern.singleton;

/**
 * @author dmb
 * @since 2019/1/23
 */
public class InnerClassSingleton {

    private InnerClassSingleton() {
    }

    public static Singleton getInstance() {
        return Singleton.singleton;
    }

    /**
     * 通过静态内部类初始化一个单例对象，保证对象了单例性，没有提前初始化，保证了按需分配
     * 是目前比较优雅的实现，不过可以按实际情况考虑是否使用该方式实现。
     */
    private static class Singleton {
        static Singleton singleton = new Singleton();
    }

}
