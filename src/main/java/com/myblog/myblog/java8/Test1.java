package com.myblog.myblog.java8;

public class Test1 {

    //Filter Strings Containing a Specific Substring:
    public static void main(String[] args) {

//        List<String> name = Arrays.asList("mike", "adam", "stallin", "sam");
//        List<String> result = name.stream().filter(s -> s.contains("ke")).collect(Collectors.toList());
//        System.out.println(result);

        Test1 testClass = new Test1();
        int val = testClass.test();
        System.out.println(val);

    }

    public int test(){
        int otp = SampleTest.test1();
        return otp;
    }
}
