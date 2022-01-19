package com.suj.springtutorial.annotation.pojo;

import com.suj.springtutorial.idef.IStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Nurse implements IStaff {
    @Value("NurseANM")
    private String qualification;
    @Autowired
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

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    @Override
    public void assist(){
        System.out.println("Nurse is assisting...");
    }
}
