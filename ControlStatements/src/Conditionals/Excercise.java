package Conditionals;

import java.util.Scanner;

public class Excercise {
    public static void main(String[] args) {

//         1. Write a program to find sum of two numbers?
//        int num1, num2;
//        Scanner in = new Scanner(System.in);
//
//        num1 = in.nextInt();
//        num2 = in.nextInt();
//
//        int sum = num1 + num2;
//        System.out.println("The Sume of num1 and num2 is = "+sum);

////        2. Write a program to find given number is odd or even?
//        int number = 0;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter number : ");
//        number = in.nextInt();
//
//        if (number % 2 == 0){
//            System.out.println("This is an Even number: " + number);
//        }else {
//            System.out.println("This is an Odd number: " + number);
//        }

        //Q 3. Write a java program to swap two variables?
        float first = 1.20f, second = 2.45f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        // Value of first is assigned to temporary
        float temporary = first;

        // Value of second is assigned to first
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        //OR

//        int a = 10, b = 20, temp;j
//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a);
//        System.out.println(b);


    }

}

// Q4 Write a program to Swap two numbers without using third variable?
class Ex1 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        int y = in.nextInt();

        int x = 10;
        int y = 20;

        //Swaping
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println(x);
        System.out.println(y);

    }
}


//5. Write a program to check the given number is prime or not?
// Prime number : a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11).

class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = in.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            System.out.println(num + " is a Prime number");
        }else {
            System.out.println(num + " is not a Prime number");

        }


    }
}

