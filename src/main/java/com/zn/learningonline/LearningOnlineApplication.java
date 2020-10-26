package com.zn.learningonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LearningOnlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningOnlineApplication.class, args);
    }

    @RequestMapping("/")
    public String test(){
        return "success";
    }
}
