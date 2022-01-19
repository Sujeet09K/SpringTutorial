package com.suj.springtutorial.annotation.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StaffDetail {
    @Value("FNU")
    private String f_name;
    @Value("LNU")
    private String l_name;
    @Value("0")
    private Integer age;

    public StaffDetail() {
    }

    public StaffDetail(String f_name, String l_name, Integer age) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.age = age;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "staffDetail{" +
                "f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", age=" + age +
                '}';
    }
}
