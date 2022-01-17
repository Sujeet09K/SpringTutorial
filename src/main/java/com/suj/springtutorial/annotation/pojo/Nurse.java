package com.suj.springtutorial.annotation.pojo;

import com.suj.springtutorial.idef.IStaff;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Nurse implements IStaff {
    @Value("NurseANM")
    private String qualification;

    public Nurse() {
    }

    public Nurse(String qualification) {
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
        System.out.println("Nurse is assisting...");
    }
}
