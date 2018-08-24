package com.electronic.test;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * @Auther: dmb
 * @Date: 2018/8/24 19:13
 * @Description:
 */
@Slf4j
public class TestProxy {

    @Test
    public void test() {

        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "F:\\code");

        //实例化一个增强器，也就是cglib中的一个class generator
        Enhancer eh = new Enhancer();
        //设置目标类
        eh.setSuperclass(Target.class);
        // 设置拦截对象
        eh.setCallback(new Interceptor());
        // 生成代理类并返回一个实例
        Target proxy = (Target) eh.create();
        proxy.setId(1);
        log.info("proxy object : {}", proxy.getClass());
        log.info("{}", proxy.getId());
    }


}

@Data
class Target {
    private Integer id;
}


class Interceptor implements MethodInterceptor {

    private static final Logger log = LoggerFactory.getLogger(Interceptor.class);

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        log.info("proxy method execute pre");
        Object object = methodProxy.invokeSuper(o, objects);
        log.info("proxy method execute behind");
        return object;
    }
}
