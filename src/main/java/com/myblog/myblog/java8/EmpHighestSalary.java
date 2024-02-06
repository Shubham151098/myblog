package com.myblog.myblog.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpHighestSalary {

    public static void main(String[] args) {

        List<Employee> empList = Arrays.asList(
                new Employee("shubham", 25,  40000),
                new Employee("Tejpal", 27, 50000),
                new Employee("pankaj", 35, 80000),
                new Employee("rahul",22,25000),
                new Employee("raj",30,60000),
                new Employee("himesh",20,20000)
        );

        //Sort By Age
        //Stream.concat(list1.stream(), list2.stream())
        //    .sortrrmparator.comparingInt(Employee::getAge))
        //    .collect(Collectors.toList());
        //empList.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(e-> System.out.println(e));

        //Start Wtih s
//      empList.stream().filter(e->e.getName().startsWith("s")).forEach(e-> System.out.println(e.getName()));


        // 3rd Highest Salary
//        Long salary = empList.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElseThrow();
//        System.out.println(salary);



    }
}
