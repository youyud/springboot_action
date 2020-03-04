package com.enjoy.springdemo.cap8.config;

import com.enjoy.springdemo.cap8.bean.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhongqiuwu
 * @desciption
 * @date 2020/02/12 21:05
 */
@Configuration
public class Cap8MainConfig {
    @Bean
    public Bird bird(){
        return new Bird();
    }
}
