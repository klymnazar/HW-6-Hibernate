package com.HW6.entity;

import java.io.Serializable;

public class School implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer schoolId;
    private String schoolName;

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public School() {
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }
}