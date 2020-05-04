package com.tgt.igniteplus;

import java.util.Scanner;

public class RemoveHyphen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String teststring = "134-10/5566 A-block, Manyata Tech-Park";
        System.out.print("Enter any string:\t");
        teststring = in.nextLine();
        int size = teststring.length();
        char[] charArray = teststring.toCharArray();
        char[] newArray = new char[size];
        int i, j = 0;
        for (i = 0; i < size; i++) {
            if (i == 0 && charArray[i] == '-' && Character.isDigit(charArray[i + 1]))
                continue;
            if (i == size - 1 && charArray[i] == '-' && Character.isDigit(charArray[i - 1]))
                continue;
            if (i > 0 && charArray[i] == '-' && Character.isDigit(charArray[i - 1]) && Character.isDigit(charArray[i + 1]))
                continue;
            else
                newArray[j++] = charArray[i];
        }
        while (j < i) {
            newArray[j++] = '\0';
        }
        System.out.println(newArray);
    }
}

/*
Output 1:
Enter any string:	134-10/5566 A-block, Manyata Tech-Park
13410/5566 A-block, Manyata Tech-Park

Output 2:
Enter any string:	-134-10/5566 A-block, Manyata Tech-Park
13410/5566 A-block, Manyata Tech-Park

Output 3:
Enter any string:	-134-10/5566 A-block, Manyata Tech-Park 1-23-
13410/5566 A-block, Manyata Tech-Park 123


 */