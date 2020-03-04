package com.enjoy.springdemo;

import com.enjoy.springdemo.cap8.bean.Bird;
import com.enjoy.springdemo.cap8.config.Cap8MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhongqiuwu
 * @desciption
 * @date 2020/02/12 15:41
 **/
public class Cap8Test {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap8MainConfig.class);
        String[] names = context.getBeanDefinitionNames();

        for (String name : names) {
            System.out.println(name);
        }
        Bird bird = (Bird) context.getBean("bird");
        System.out.println(bird);

        System.out.println("IOC容器创建完成...");
        context.close();
    }
}
