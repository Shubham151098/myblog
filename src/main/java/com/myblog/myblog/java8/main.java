package com.myblog.myblog.java8;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {

        College college1 = new College(
                1,"BIT","Raipur"
        );

        Office office1 = new Office(
                1,"TCS","Pune"
        );

        Student student = new Student(
                1,"mike",college1,office1
        );

        College college2 = new College(
                2,"VIT","Bangalore"
        );

        Office office2 = new Office(
                2,"Wipro","Hydrabad"
        );

        Student student2 = new Student(
                2,"adam",college2,office2
        );

        List<Student> students = Arrays.asList(student,student2);

        students.stream().filter(e -> e.getCollege().getCollegeName() == "BIT").map(Student::getStudentName).forEach(System.out::println);






    }
}
