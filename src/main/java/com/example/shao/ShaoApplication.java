package com.example.shao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync
@EnableScheduling
public class ShaoApplication {

    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(ShaoApplication.class);
        //禁止命令行设置参数
        springApplication.setAddCommandLineProperties(false);


        SpringApplication.run(ShaoApplication.class, args);
    }

}
