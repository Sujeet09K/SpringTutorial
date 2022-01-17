package com.suj.springtutorial.demo;

import com.suj.springtutorial.idef.IStaff;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.suj.springtutorial.annotation")
@Configuration
public class SpringTutorialAnnotationDemo {
    public static void main(String[] args) {

        ApplicationContext applicationContext;
        applicationContext = new AnnotationConfigApplicationContext(SpringTutorialAnnotationDemo.class);
        IStaff staff;
        staff = (IStaff) applicationContext.getBean("doctor");
        staff.assist();
        System.out.println(staff.getQualification());
        staff = (IStaff) applicationContext.getBean("nurse");
        staff.assist();
        System.out.println(staff.getQualification());
    }
}