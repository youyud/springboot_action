package com.enjoy.springdemo;

import com.enjoy.springdemo.cap10.aop.Calculator;
import com.enjoy.springdemo.cap10.config.Cap10MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhongqiuwu
 * @desciption
 * @date 2020/02/12 15:41
 **/
public class Cap10Test {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap10MainConfig.class);

        Calculator c = context.getBean(Calculator.class);
        int div = c.div(4, 2);
        System.out.println(div);

        context.close();
    }
}
