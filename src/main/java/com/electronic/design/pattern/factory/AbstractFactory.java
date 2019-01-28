package com.electronic.design.pattern.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author dmb
 * @since 2019/1/27
 */
public class AbstractFactory {

    private static final Logger log = LoggerFactory.getLogger("ABSTRACT_FACTORY");


    public static void main(String[] args) {
        SupperFactory factory = new FactoryA();
        factory.createProductA();
        factory.createProductB();
    }
}

/**
 * 抽象工厂，具有创建一系列产品的能力,顶层工厂不需要关心具体的产品类
 * 为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类。
 */
interface SupperFactory {

    Product createProductA();

    Product createProductB();

}

class FactoryA implements SupperFactory{

    @Override
    public Product createProductA() {
        return new ProductA1();
    }

    @Override
    public Product createProductB() {
        return new ProductB1();
    }
}

class FactroyB implements SupperFactory {

    @Override
    public Product createProductA() {
        return null;
    }

    @Override
    public Product createProductB() {
        return null;
    }
}

interface Product {

}

abstract class ProductA implements Product{

}

abstract class ProductB implements Product{

}

class ProductA1 extends ProductA{
    public ProductA1() {
        System.out.println("我是A1产品");
    }
}

class ProductB1 extends ProductB {
    public ProductB1() {
        System.out.println("我是B1产品");
    }
}


