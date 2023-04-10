package com.bl.day1;

public class StaticVariablesAndMethods {

    static  int a = 10;
    static int b = 20;
    static int c;

    static void sum(){

        c = a+b;
        System.out.println("Addition is : " + c);
    }
    public static void main(String[] args) {

        sum();
    }
}
