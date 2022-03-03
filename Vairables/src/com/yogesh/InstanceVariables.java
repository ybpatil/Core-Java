package com.yogesh;

    // ** Instance variables **
// Instance variables are associated with instance or object of class
// Instance variables are declared in a class but outside a methods, constructor or block
// Instance variable will not have a static keyword
// When a space is allocated for an object in the heap a slot for each instance variable value is created
// Instance variable are created when an  object is created with the use of the keyword 'new' and destroyed when the object is destroyed
// Instance variables can be accessed by calling with the -  "objectName.VariableName"
// Default values : for integers , floats etc = 0, for booleans = false & for object references = null
public class InstanceVariables {
    int c;
    int d = 10;


        public void addition() {
            int a = 10;
            int b = 20;
            c = a + b;
            System.out.println("Sum of a and b is: " + c);
        }

        public void differance() {
            int x = 10;
            int y = 20;
            c = x + y;
            System.out.println("Differance between a and b is: " + c);
        }

        public static void main(String[] args) {
            InstanceVariables ins1 = new InstanceVariables();
            ins1.addition();
            ins1.differance();
        }


    }
