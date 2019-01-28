package com.electronic.design.pattern.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

/**
 * @author dmb
 * @since 2019/1/23
 */
public class SimpleFactory {

    private static final Logger log = LoggerFactory.getLogger("SIMPLE_FACTORY");

    /**
     * 总结起来就是一个工厂类，一个产品接口（其实也可以是一个抽象类，
     * 甚至一个普通的父类，但通常我们觉得接口是最稳定的，
     * 所以基本不需要考虑普通父类的情况），和一群实现了产品接口的具体产品，
     * 而这个工厂类，根据传入的参数去创造一个具体的实现类，
     * 并向上转型为接口作为结果返回。
     * @param clazz
     * @return
     */
    public static Person createPerson(Class<? extends Person> clazz) {

        if (Objects.isNull(clazz)) {
            return null;
        }
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            log.error("实例化class{}失败", clazz);
        } catch (IllegalAccessException e) {
            log.error("实例化class{}失败,非法访问", clazz);
        }
        return null;
    }

}

abstract class Person {
    public abstract void say();
}

class BlackPerson extends Person {

    @Override
    public void say() {
        System.out.println("黑人说话");
    }
}

class WhitePerson extends Person {
    @Override
    public void say() {
        System.out.println("白人说话");
    }
}
