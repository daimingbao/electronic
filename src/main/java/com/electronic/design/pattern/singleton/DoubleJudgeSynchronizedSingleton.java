package com.electronic.design.pattern.singleton;

/**
 * @author dmb
 * @since 2019/1/23
 */
public class DoubleJudgeSynchronizedSingleton {

    private static DoubleJudgeSynchronizedSingleton singleton;

    private DoubleJudgeSynchronizedSingleton() {}

    /**
     * 通过双层判断，只有未初始化单例对象时候才同步，可以减少同步次数，提高效率
     * 考虑到对象的初始过程：
     *  1.分配内存
     *  2.初始化构造器
     *  3.将对象指向分配的内存的地址
     *  如果代码有重排序，以上3和2的顺序交换，执行完
     *  第2步后就将对象引用赋值给到单例对象引用了，会导致获取到的对象没有真正初始化
     * @return
     */
    public static DoubleJudgeSynchronizedSingleton getInstance() {

        if (singleton == null) {
            synchronized (DoubleJudgeSynchronizedSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleJudgeSynchronizedSingleton();
                }
            }
        }
        return singleton;

    }

}
