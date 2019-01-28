package com.electronic.design.pattern.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

/**
 * @author dmb
 * @since 2019/1/27
 */
public class FactoryMethod implements Factory{

    private static final Logger log = LoggerFactory.getLogger("FACTORY_METHOD");

    /**
     * 工厂方法(Factory Method)模式的意义是定义一个创建产品对象的工厂接口，
     * 将实际创建工作推迟到子类当中。核心工厂类不再负责产品的创建，
     * 这样核心类成为一个抽象工厂角色，仅负责具体工厂子类必须实现的接口，
     * 这样进一步抽象化的好处是使得工厂方法模式可以使系统在不修改具体工厂角色的情况下引进新的产品。
     * @param clazz
     * @return
     */
    @Override
    public User createUser(Class<? extends User> clazz) {
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

interface Factory {

    User createUser(Class<? extends User> clazz);

}

class User {

}
