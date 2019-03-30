package com.electronic.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dmb
 * @since 2019/3/6
 */
@Slf4j
public class HashMapTest {

    @Test
    public void test() {

        Map<String, Integer> map = new HashMap();
        map.put("a", 1);

    }
}
