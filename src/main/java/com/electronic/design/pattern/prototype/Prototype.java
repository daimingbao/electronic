package com.electronic.design.pattern.prototype;

/**
 * @author dmb
 * @since 2019/1/27
 */
public class Prototype {


    /**
     * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
     * 调用克隆方法不会执行构造函数
     * 1、对象的创建非常复杂，可以使用原型模式快捷的创建对象。
     * <p>
     * 2、在运行过程中不知道对象的具体类型，
     * 可使用原型模式创建一个相同类型的对象，或者在运行过程中动态的获取到一个对象的状态。
     *
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeDemo prototypeDemo = new PrototypeDemo("a", "b");
        PrototypeDemo prototypeDemo1 = (PrototypeDemo) prototypeDemo.clone();

    }


}


class PrototypeDemo implements Cloneable {
    public PrototypeDemo() {
    }

    public PrototypeDemo(String name, Object obj) {
        this.name = name;
        this.obj = obj;
        System.out.println("创建对象经理了复杂的过程");
    }

    private String name;

    private Object obj;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


