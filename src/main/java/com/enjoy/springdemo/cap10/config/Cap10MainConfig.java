package com.enjoy.springdemo.cap10.config;

import com.enjoy.springdemo.cap10.aop.Calculator;
import com.enjoy.springdemo.cap10.aop.LogAspects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zhongqiuwu
 * @desciption
 * @date 2020/02/14 21:59
 */
@Configuration
@EnableAspectJAutoProxy
public class Cap10MainConfig {
    @Bean
    public Calculator calculator(){
        return new Calculator();
    }

    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }
}
