package com.suj.springtutorial.demo;

import com.suj.springtutorial.idef.IStaff;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTutorialXMLDemo {
    public static void main(String[] args) {

        ApplicationContext applicationContext;
        applicationContext = new ClassPathXmlApplicationContext("appContext.xml");
        IStaff staff;
        staff = (IStaff) applicationContext.getBean("doctor");
        staff.assist();
        System.out.println("Staff Details: "+staff.toString());
        staff = (IStaff) applicationContext.getBean("nurse");
        staff.assist();
        System.out.println("Staff Details: "+staff.toString());
    }
}
