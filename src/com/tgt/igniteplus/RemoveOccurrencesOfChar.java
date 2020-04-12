//Program to remove all occurrences of a character from a given string
package com.tgt.igniteplus;
import java.util.Scanner;
public class RemoveOccurrencesOfChar {
    public static void main(String[] args) {
        String testString;
        char character;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any string:\t");
        testString = in.nextLine();
        System.out.print("Enter character to be removed:\t");
        character = in.next().charAt(0);
        CharRemoval(testString, character);
    }
    static void CharRemoval(String teststring, char character)
    {
        int j = 0;
        int size;
        char temp;
        size = teststring.length();
        char newString[] = new char[size];
        char charArray[] = teststring.toLowerCase().toCharArray();

        for (int i = 0; i < size; i++) {
            if (charArray[i] != character) {
                temp = charArray[i];
                newString[j] = temp;
                j++;
            }
        }
        newString[j] = '\0';

        System.out.println(newString);

    }
}
/*
Output 1:
Enter any string:	To test this string
Enter character to be removed:	t
o es his sring

Output 2:
Enter any string:	heLLO World
Enter character to be removed:	l
heo word
 */