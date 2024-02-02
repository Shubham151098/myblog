package com.myblog.myblog.java8;


public class Student {


    private long studentId;
    private String studentName;
    private College college;
    private Office office;

    public Student(long studentId, String studentName, College college, Office office) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
        this.office = office;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", college=" + college +
                ", office=" + office +
                '}';
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }
}
