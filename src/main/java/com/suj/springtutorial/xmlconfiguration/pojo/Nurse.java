package com.suj.springtutorial.xmlconfiguration.pojo;


import com.suj.springtutorial.idef.IStaff;

public class Nurse implements IStaff {
    private String qualification;
    private StaffDetail staffDetail;
    private Long staffId;

    public Nurse() {
    }

    public Nurse(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
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
    public String toString() {
        return "Nurse{" +
                "qualification='" + qualification + '\'' +
                ", staffDetail=" + staffDetail +
                ", staffId=" + staffId +
                '}';
    }

    //    @Resource(name="qualification")
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    @Override
    public void assist(){
        System.out.println("Nurse is assisting...");
    }
}
