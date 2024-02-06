package com.myblog.myblog.java8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImp {

    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(4);
        num.add(6);
        num.add(7);
        num.add(9);

        System.out.println(num);

        num.add(2,5);
        System.out.println(num);
    }


}
