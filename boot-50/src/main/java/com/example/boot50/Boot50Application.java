package com.example.boot50;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
@MapperScan("com.example.mapper")
public class Boot50Application {

    public static void main(String[] args) {

        SpringApplication.run(Boot50Application.class, args);
    }

}
