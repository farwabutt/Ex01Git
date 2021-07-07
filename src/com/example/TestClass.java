package com.example;

public class TestClass {
    public static int sum(int a, int b){
        if(a+b>0)
            return a+b;
        else
            return 0;
    }
    public static void main(String[] args) {
        System.out.print("Sum: ");
        System.out.println(sum(5,6));
    }

}
