package com.enjoy.springdemo.cap10.aop;

import org.springframework.stereotype.Component;

/**
 * @author zhongqiuwu
 * @desciption
 * @date 2020/02/14 22:00
 */
@Component
public class Calculator {
    public int div(int i, int j) {
        System.out.println("-------");
        return i / j;
    }
}
