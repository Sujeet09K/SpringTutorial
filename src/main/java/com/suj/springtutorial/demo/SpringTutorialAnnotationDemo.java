package com.suj.springtutorial.demo;

import com.suj.springtutorial.idef.IStaff;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.suj.springtutorial.annotation")
@Configuration
public class SpringTutorialAnnotationDemo {
    static ApplicationContext applicationContext;
    public static void main(String[] args) {
        applicationContext = new AnnotationConfigApplicationContext(SpringTutorialAnnotationDemo.class);
        IStaff staff;
        System.out.println("Instance of Singleton bean scope");
        staff = (IStaff) applicationContext.getBean("doctor");
        staff.setStaffId(101L);
        displayStaff(staff);

        displayStaff((IStaff) applicationContext.getBean("doctor"));

        System.out.println("\n\nInstance of Prototype bean scope");
        staff = (IStaff) applicationContext.getBean("nurse");
        staff.setStaffId(1001L);
        displayStaff(staff);

        System.out.println("Testing default bean Prototype scope");
        displayStaff((IStaff) applicationContext.getBean("nurse"));
    }

    public static void displayStaff(IStaff staff){
        staff.assist();
        System.out.println("Staff Details: "+staff.toString());
    }
}