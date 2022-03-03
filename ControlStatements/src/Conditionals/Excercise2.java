package Conditionals;

import java.util.Scanner;

// Q.1 Write a program to find factorial?
//Description: Factorial of any number is the product of an integer and all the integers below it for example factorial of 4 is 4! = 4 * 3 * 2 * 1 = 24.
public class Excercise2 {
    public static void main(String[] args) {
//        int num = 10;
//        long factorial = 1;
//
//        for(int i = 1; i <= num; ++i)
//        {
//            // factorial = factorial * i;
//            factorial *= i;
//        }
//        System.out.printf("Factorial of %d = %d", num, factorial);
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int i = 1;
        long factorial = 1;

        while(i <= num)
        {
            factorial *= i; // factorial = factorial * i
            i++;
        }
        System.out.printf("Factorial of "  + num + " = " + factorial);

    }
}

// Assignment 2 - Q.2

//class  Ex1{
//
//}