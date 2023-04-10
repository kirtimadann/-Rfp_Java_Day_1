package com.bl.day1;
import java.util.*;
public class CommandLineArgument {

    public static void main(String[] args) {

        try{



        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();

        int c = a+b;
        System.out.println(c);

        } catch(Exception e){
                System.out.println("invalid number");
            }
        }
    }

