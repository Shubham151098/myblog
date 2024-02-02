package com.myblog.myblog.java8;

public class College {
    private int collegeId;
    private String collegeName;
    private String collegeAddress;

    public College(int collegeId, String collegeName, String collegeAddress) {
        this.collegeId = collegeId;
        this.collegeName = collegeName;
        this.collegeAddress = collegeAddress;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeAddress() {
        return collegeAddress;
    }

    public void setCollegeAddress(String collegeAddress) {
        this.collegeAddress = collegeAddress;
    }
}
