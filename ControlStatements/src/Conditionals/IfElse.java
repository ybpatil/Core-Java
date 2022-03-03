package Conditionals;

public class IfElse {

    public static void main(String[] args) {

        // If statements
        /*  Syntax
        if (Boolean exp) {
            // statements
        } else {
            // statements
        }

         */

        int age = 16;

        if (age >= 18 ) {
            System.out.println("You are eligible to vote");
        } else if (age == 17){
            System.out.println("You are teen so, can\'t vote");
        }else {
            System.out.println("You are not eligible to vote");

        }

    }
}
