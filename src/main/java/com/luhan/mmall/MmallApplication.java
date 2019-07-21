package com.luhan.mmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author luHan
 * @date 2019-07-21 19:07
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.luhan.mmall.dao.*"})
public class MmallApplication {
    public static void main(String[] args) {
        SpringApplication.run(MmallApplication.class,args);
    }
}
