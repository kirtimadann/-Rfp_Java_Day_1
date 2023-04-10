package com.bl.day1;

public class CheckStringIsEquilsNot {

    String s1 = "kirti";
    String s2 = "kirti";

    public static void main(String[] args) {

        CheckStringIsEquilsNot obj = new CheckStringIsEquilsNot();


        if (obj.s1 == obj.s2){
            System.out.println("This is equils");
        }else {
            System.out.println("not same");
        }
    }
}
