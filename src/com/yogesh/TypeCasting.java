package com.yogesh;

// Type casting (converting one data type into another data type)
// Widening casting (Automatic casting) >> converting smaller data into larger data type
// Narrowing casting (Manual casting) >> converting larger data type into smaller data type

public class TypeCasting {
    public static void main(String[] args) {
        short s = 10;
        int num = s; // Widening casting
        System.out.println("Print value of s = " + s );


        int num1 = 127;
        short s1 = (short) num1;
        System.out.println("Print value of s1 = " + s1 );

        double d = 3223323.54;
        int i =(int) d; // Narrowing casting
        System.out.println("Print value of b = " + i );

    }
}
