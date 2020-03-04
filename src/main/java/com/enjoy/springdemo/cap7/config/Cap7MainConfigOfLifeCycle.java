package com.enjoy.springdemo.cap7.config;

import com.enjoy.springdemo.cap7.bean.Jeep;
import com.enjoy.springdemo.cap7.bean.Person;
import com.enjoy.springdemo.cap7.bean.Plane;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhongqiuwu
 * @desciption
 * @date 2020/02/12 15:35
 **/
@Configuration
public class Cap7MainConfigOfLifeCycle {
    @Bean("person")
    public Person person() {
        System.out.println("给容器中添加person.....");
        return new Person("wu", 20);
    }

    @Bean
    public Jeep jeep() {
        return new Jeep();
    }

    @Bean
    public Plane plane() {
        return new Plane();
    }
}
