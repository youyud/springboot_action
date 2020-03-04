package com.enjoy.springdemo.cap8.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author zhongqiuwu
 * @desciption
 * @date 2020/02/12 21:04
 */
public class Bird {
    @Value("wu")
    private String name;
    private Integer age;

    public Bird() {
    }

    public Bird(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
