package com.electronic.test;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.Range;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 * @author dmb
 * @since 2019/3/15
 */
@Slf4j
public class TimeTest {

    @Test
    public void test2() {
        Integer a = 1;
        Integer b = 1;
        System.out.println(a == b);
    }

    @Test
    public void test() throws ParseException {

        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMdd");
        Date beginDate = sf.parse("20190201");
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTime(beginDate);
        calendar.set(Calendar.DATE, calendar.getActualMaximum(Calendar.DATE));
        Date endDate = calendar.getTime();
        log.info("{}", beginDate );
        log.info("{}", endDate );

    }

    @Test
    public void testDate() {

        Instant instant = new Date().toInstant();
        instant =    instant.plus(1, ChronoUnit.DAYS);
        log.info(instant.toString());

        Date date = Date.from(instant);
        log.info("{}", date);

    }

}
