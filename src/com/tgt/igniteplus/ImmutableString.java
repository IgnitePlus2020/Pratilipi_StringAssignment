//Program to show that strings are immutable
package com.tgt.igniteplus;

public class ImmutableString {
    public static void main(String[] args) {
        String string_1 = "HELLO";
        String string_2 = string_1.replace('H', 'M');

        //The initial string is still the same
        System.out.println("First string = " + string_1);
        System.out.println("Second string = " + string_2);
    }
}
/*
Output 1:
First string = HELLO
Second string = MELLO
 */