package com.enjoy.springdemo;

import com.enjoy.springdemo.cap9.config.Cap9MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhongqiuwu
 * @desciption
 * @date 2020/02/12 15:41
 **/
public class Cap9Test {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Cap9MainConfig.class);

        context.close();
    }
}
