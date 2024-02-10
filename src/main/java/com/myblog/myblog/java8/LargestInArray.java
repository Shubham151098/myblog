package com.myblog.myblog.java8;

public class LargestInArray {
    static int[] arr = {10,30,40,50,2,90,4,2,46};

    public static int largest(){
        int i;
        int max = arr[0];
        for(int x = 0; x< arr.length; x++){
            if(arr[x]>max);
            max = arr[x];
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(largest());
    }
}
