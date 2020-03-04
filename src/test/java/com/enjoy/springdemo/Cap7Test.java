package com.enjoy.springdemo;

import com.enjoy.springdemo.cap7.config.Cap7MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhongqiuwu
 * @desciption
 * @date 2020/02/12 15:41
 **/
public class Cap7Test {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap7MainConfigOfLifeCycle.class);
        System.out.println("IOC容器创建完成...");
        context.close();
    }
}
