//Program to check if a given string contains only digits
package com.tgt.igniteplus;

import java.util.Scanner;

public class DigitString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String testString;
        System.out.print("Enter a test string:\t");
        testString = in.nextLine();
        System.out.println("String:\t" + testString);
        if (testString.matches("[0-9]+") && testString.length() > 2) {
            System.out.println("String contains only digits!");
        } else {
            System.out.println("String contains digits as well as other characters!");
        }
    }
}
/*
Output 1:
Enter a test string:	12345
String:	12345
String contains only digits!

Output 2:
Enter a test string:	abc123
String:	abc123
String contains digits as well as other characters!
 */
