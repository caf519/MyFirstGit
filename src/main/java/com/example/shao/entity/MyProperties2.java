package com.example.shao.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@ConfigurationProperties(prefix="com.zc")
public class MyProperties2 implements Serializable {

    private String name;
    private Integer age;
    private String desc;
    private String random;

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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRandom() {
        return random;
    }

    public void setRandom(String random) {
        this.random = random;
    }
}
