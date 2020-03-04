package com.enjoy.springdemo.cap7.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author zhongqiuwu
 * @desciption
 * @date 2020/02/12 17:30
 **/
@Component
public class Jeep {
    public Jeep() {
        System.out.println("Jeep constructor.....");
    }

    @PostConstruct
    public void init(){
        System.out.println("Jeep @PostConstruct.....");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Jeep @PreDestroy......");
    }
}
