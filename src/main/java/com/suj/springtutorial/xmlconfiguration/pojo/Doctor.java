package com.suj.springtutorial.xmlconfiguration.pojo;

import com.suj.springtutorial.idef.IStaff;

public class Doctor implements IStaff {
    private String qualification;
    private StaffDetail staffDetail;
    private Long staffId;
    
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

    public StaffDetail getStaffDetail() {
        return staffDetail;
    }

    public void setStaffDetail(StaffDetail staffDetail) {
        this.staffDetail = staffDetail;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    @Override
    public void assist(){
        System.out.println("Doctor is assisting...");
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                ", staffDetail=" + staffDetail +
                ", staffId=" + staffId +
                '}';
    }
}
