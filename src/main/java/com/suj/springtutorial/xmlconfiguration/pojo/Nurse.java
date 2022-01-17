package com.suj.springtutorial.xmlconfiguration.pojo;


import com.suj.springtutorial.idef.IStaff;

public class Nurse implements IStaff {
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
