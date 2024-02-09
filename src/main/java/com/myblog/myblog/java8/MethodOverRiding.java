package com.myblog.myblog.java8;

import org.springframework.http.converter.json.GsonBuilderUtils;

public class MethodOverRiding {

    public void test(int x){
        x = 10;
        System.out.println(x);
    }
}

class Test extends MethodOverRiding{

    public void test(int x){
        x = 10;
        System.out.println(x);
    }

    public static void main(String[] args) {

        Test test = new Test();
        test.test(50);

    }



}