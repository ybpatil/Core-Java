package Conditionals;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Guess your day: ");
        int day = in.nextInt();

        switch (day){
            case 1: {
                System.out.println("Monday");
//                break;
            }
            case 2: {
                System.out.println("Tuesday");
//                break;
            }
            case 3: {
                System.out.println("Wednesday");
//                break;
            }
            case 4: {
                System.out.println("Thursday");
                break;
            }
            default: {
                if (day <= 7) {
                    System.out.println("Fri - Sunday");
                }else {
                    System.out.println("Invalid Input, please enter valid input");
                }
            }

        }

    }
}
