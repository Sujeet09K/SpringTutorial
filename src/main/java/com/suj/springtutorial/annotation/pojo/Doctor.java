package com.suj.springtutorial.annotation.pojo;

import com.suj.springtutorial.idef.IStaff;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Doctor implements IStaff {
    @Value("doctorMBBS")
    private String qualification;

    public Doctor() {
    }

    public Doctor(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public void assist(){
        System.out.println("Doctor is assisting...");
    }
}
