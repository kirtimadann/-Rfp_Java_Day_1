package com.bl.day1;
import java.util.*;
public class LeapYear {

    static int year;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         year = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ){

            System.out.println("this is Leap year");

        }else {
            System.out.println("not leap year");
        }

    }
}
