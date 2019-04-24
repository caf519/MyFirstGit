package com.example.shao.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@ConfigurationProperties(prefix="com.zc")
public class MyRandom implements Serializable {

    private String myint;
    private String myint10;
    private String myint10_20;
    private String mylong;
    private String myuuid;

    public String getMyint() {
        return myint;
    }

    public void setMyint(String myint) {
        this.myint = myint;
    }

    public String getMyint10() {
        return myint10;
    }

    public void setMyint10(String myint10) {
        this.myint10 = myint10;
    }

    public String getMyint10_20() {
        return myint10_20;
    }

    public void setMyint10_20(String myint10_20) {
        this.myint10_20 = myint10_20;
    }

    public String getMylong() {
        return mylong;
    }

    public void setMylong(String mylong) {
        this.mylong = mylong;
    }

    public String getMyuuid() {
        return myuuid;
    }

    public void setMyuuid(String myuuid) {
        this.myuuid = myuuid;
    }
}
