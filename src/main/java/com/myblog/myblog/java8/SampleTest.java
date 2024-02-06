package com.myblog.myblog.java8;

public class SampleTest {
    public static int test1() {
        SampleTest st = new SampleTest();
        int otp = st.returnOtp();
        return otp;

    }

    public int returnOtp(){
        return 12345;
    }
}
