package com.zn.learningonline;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan(basePackages ="com.zn.learningonline.mapper")
@EnableTransactionManagement
public class LearningOnlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningOnlineApplication.class, args);
    }

}
