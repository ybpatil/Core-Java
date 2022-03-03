package com.yogesh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        System.out.print("Enter roll no: ");
        int rollNo = in.nextInt();
        System.out.println("your roll no is " +rollNo);

        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.println(" your name is " + name);

//        System.out.print("Enter your fee amount: ");
//        Double fee = in.nextDouble();
    }
}
