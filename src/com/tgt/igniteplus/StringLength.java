//Program to determine the length of a given string
package com.tgt.igniteplus;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any string:\t");
        String testString = in.nextLine();
        int strLength = testString.length();
        System.out.println("The string \"" + testString + "\" contains " + strLength + " characters.");
    }
}
/*
Output :
Enter any string:	hello world
The string "hello world" contains 11 characters.
 */