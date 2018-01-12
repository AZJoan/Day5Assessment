package com.company;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Day5Assessment {

    public static void main(String[] args) {

//    Write an application that when loads, asks "Hello! Please enter your name", allowing the user to enter their name.
//    Once the user enters their name, ask the user their current age. Finally, ask them the current year.
//    Once the user enters their information, the application should output their name,
//       how old the user will be next year, in 5 years, and in 10 years, along with the associated years of those ages.
//    An example of the final output of the application:
//    Sam, you are currently 42 years old.
//    In 2018, you will be 43 years old.  *** will result in 2019 ***
//    In 2022, you will be 47 years old.
//    In 2027, you will be 52 years old.

        // Prompt & get user name
        System.out.println("Hello! Please enter your name.");
        Scanner sc = new Scanner(System.in);
        String UserName = sc.nextLine();

        // Prompt & get user current age
        System.out.println("Please enter your age.");
        String UserAge = sc.nextLine();

        // Display NAME you are currently AGE years old.
        System.out.println(UserName + " you are currently " + UserAge + " years old.");

        // Get current year and add by 1, 5, 10 years
        Calendar cal = Calendar.getInstance();
        int year = cal.get(cal.YEAR);
        int ageN = Integer.parseInt(UserAge);

        // Populate arrays for holding years, ages and the add to numbers
        List<String> results = new ArrayList<>();

        int[] addarr = {1,5,10,};
        int sumYr;
        int sumAge;

        for (int i = 0; i < addarr.length; i++) {
           sumYr = year + addarr[i];
           sumAge = ageN + addarr[i];
           results.add("In " + sumYr + ",you will be " + sumAge + " years old.");
           }

        // Display the messages in the array to the user
        for (int i = 0; i < addarr.length; i++) {
            String showanswer = results.get(i);
            System.out.println(showanswer);

       }


    }
}
