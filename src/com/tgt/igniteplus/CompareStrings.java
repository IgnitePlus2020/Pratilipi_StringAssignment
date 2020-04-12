/* Program to compare two given strings:
1. equals() method
2. compareTo() method
    s1 == s2 :0
    s1 > s2  :positive value
    s1 < s2  :negative value
3. == operator compares references not values
 */
package com.tgt.igniteplus;

public class CompareStrings {
    public static void main(String[] args) {
        String string_1 = "world";
        String string_2 = "world";
        String string_3 = new String("world");
        String string_4 = "hello";

        System.out.println("\n1. equals() method:");
        System.out.println(string_1 + " equals " + string_2 + ":\t" + string_1.equals(string_2));
        System.out.println(string_1 + " equals " + string_4 + ":\t" + string_1.equals(string_4));

        System.out.println("\n2. compareTo() method:");
        System.out.println(string_1 + " equals " + string_2 + ":\t" + string_1.compareTo(string_2));
        System.out.println(string_1 + " equals " + string_4 + ":\t" + string_1.compareTo(string_4));

        System.out.println("\n3. == operator:");
        System.out.println(string_1 + " equals " + string_2 + ":");
        System.out.println(string_1 == string_2);
        System.out.println(string_1 == string_3);

        System.out.println("\n4. equalsIgnoreCase() method:");
        System.out.println(string_1 + " equals " + string_2 + ":\t" + string_1.equalsIgnoreCase(string_2));
        System.out.println(string_1 + " equals " + string_4 + ":\t" + string_1.equalsIgnoreCase(string_4));

        System.out.println("\n5. compareToIgnoreCase() method:");
        System.out.println(string_1 + " equals " + string_2 + ":\t" + string_1.compareToIgnoreCase(string_2));
        System.out.println(string_1 + " equals " + string_4 + ":\t" + string_1.compareToIgnoreCase(string_4));
    }
}
/*
Output:
1. equals() method:
world equals world:	true
world equals hello:	false

2. compareTo() method:
world equals world:	0
world equals hello:	15

3. == operator:
world equals world:
true
false

4. equalsIgnoreCase() method:
world equals world:	true
world equals hello:	false

5. compareToIgnoreCase() method:
world equals world:	0
world equals hello:	15
 */