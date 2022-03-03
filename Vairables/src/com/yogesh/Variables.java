package com.yogesh;


// Local variables  - Local variables are declared inside methods, constructor or block
// local variables can be accessed within method, constructor or block only and are destroyed once program is executed
// local variable must always be initialised before use else compilation time error will br thrown

public class Variables {
    public static void main(String[] args) {
        int a = 20; // scope of " a" is throughout the method from the point of declaration
        {
            int b = 10; // scope of "b" is within this block only -   local variable must always be initialised before use else compilation time error will throw
            System.out.println("Value of a = " + a);
        }
      //  System.out.println("Value of a = " + b); // compile time error
          System.out.println("Value of a = " + a);

    }
}



















