package com.myblog.myblog.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDupicateChar {

    public static void main(String[] args) {

        String name = "Shubham";
        StringBuilder result = new StringBuilder();

        for(int i=0;i<name.length();i++){
            char c = name.charAt(i);

            if(result.indexOf(String.valueOf(c))==-1){
                result.append(c);
            }

        }
        System.out.println(result.toString());


    }

}
