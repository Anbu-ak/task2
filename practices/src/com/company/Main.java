package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
       int year;
        System.out.println("enter the year to check leap year  or not");
        year=in.nextInt();

        if(year %400==0)
            System.out.println(year + "is a leap year");

        else
            if (year % 4 == 0 && year % 100 != 0)
                System.out.println(year + "is a leap year");
            else
                System.out.println(year + "is not a leap year");


    }




    }

