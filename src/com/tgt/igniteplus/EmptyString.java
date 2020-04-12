//Program to check if a given string is empty or not
package com.tgt.igniteplus;

import java.util.Scanner;

public class EmptyString {
    public static void main(String[] args) {
        System.out.print("Enter any string:\t");
        Scanner in = new Scanner(System.in);
        String testString = in.nextLine();
        if (testString == null || testString.isEmpty())
            System.out.println("String is EMPTY!");
        else
            System.out.println("String is not empty.");
    }
}
/*
Output 1:
Enter any string:
String is EMPTY!
 */