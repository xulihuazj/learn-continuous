/*
 * TestLocalDateTime.java 1.0.0 2017/12/9  19:15 
 * Copyright © 2014-2017,52mamahome.com.All rights reserved
 * history :
 *     1. 2017/12/9  19:15 created by xulihua
 */
package JDK8.time;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

/**
 * @Description:
 * @author: xulihua
 * @date: 2017/12/9 19:15
 */
public class TestLocalDateTime {

    @Test
    public void test1() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println("************************************************************");
        LocalDateTime localDateTime2 = LocalDateTime.of(2017, 10, 10, 12, 24);
        System.out.println(localDateTime2);

        System.out.println(localDateTime.plusYears(1L));

        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
    }

    @Test
    public void test2() {

        Instant instant1 = Instant.now();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

        }

        Instant instant2 = Instant.now();
        Duration duration = Duration.between(instant1, instant2);
        System.out.println(duration.getSeconds());
        System.out.println(duration.toMillis());
    }

    @Test
    public void test3() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = localDateTime.withDayOfMonth(10);
        System.out.println(localDateTime1);


        //下一个周日
        System.out.println(localDateTime.with(TemporalAdjusters.next(
                DayOfWeek.SUNDAY
        )));
    }


    @Test
    public void test4(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(dateTimeFormatter));

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        System.out.println(localDateTime.format(dateTimeFormatter1));

    }

}
