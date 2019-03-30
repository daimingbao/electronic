package com.electronic.test;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dmb
 * @since 2019/3/27
 */
@Slf4j
public class ListTest {



    @Test
    public void test() {

        new HelloB();

        String a = new String("hello");
        String b = new String("hello");

        String c = "hello";
        String d = "hello";

        log.info("{}", a == b);
        log.info("{}", c == d);


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        log.info(JSON.toJSONString(list));
        list.remove(1);
        log.info(JSON.toJSONString(list));
        list.remove(0);
        list.remove(new Integer(3));
        log.info(JSON.toJSONString(list));

    }
}

@Slf4j
class HelloA {
    public HelloA() {
        log.info("HELLOA");
    }
    {
        log.info("i'm helloa");
    }
    static {
        log.info("static A");
    }
}

@Slf4j
class HelloB extends HelloA{
    public HelloB() {
        log.info("HELLOB");
    }
    {
        log.info("i'm hello B");
    }
    static {
        log.info("static B");
    }
}
