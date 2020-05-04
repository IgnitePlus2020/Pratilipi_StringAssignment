//Program to check if a given string contains only digits
package com.tgt.igniteplus;

import java.util.Scanner;

public class DigitString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String testString;
        System.out.print("Enter a test string:\t");
        testString = in.nextLine();
        if (testString.length() <= 0) {
            System.out.println("Invalid string!");
            System.exit(0);
        } else {
            System.out.println("String:\t" + testString);
            if (testString.matches("[0-9]+"))
                System.out.println("String contains only digits!");
            else if (testString.matches("[a-zA-Z]+"))
                System.out.println("String contains only alphabets!");
            else
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

Output 3:
Enter a test string:
Invalid string!

Output 4:
Enter a test string:	abc
String:	abc
String contains only alphabets!
 */
