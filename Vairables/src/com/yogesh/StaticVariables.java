package com.yogesh;

// Static Variables are also known as Class variables as they are associated with class and not with an instance or object
// Static variables are declared with static keyword in a class, but outside a method,  constructor or block
// There would only be one copy of each class variable per class, regardless of how many objects are created from it.
// Static variables are stored in static memory. It is rare to use static variables other than declared final & used as either public or private constants.
// Static variables can be accessed by calling with the -  "className.VariableName"
// Default values : for integers , floats etc = 0, for booleans = false & for object references = null
// Values can be assigned in special static initializer blocks. or during declaration or within the constructor.

public class StaticVariables {

    static int  intVar; // Variable declaration
    static float floatVar;
    static Object obj;
    static boolean boolVar;

    static Double marks = 89.8; // initialization of variable

    public static void main(String[] args) {
        System.out.println("Default value of intVar = " + intVar);
        System.out.println("Default value of float = " + floatVar);
        System.out.println("Default value of obj = " + obj);
        System.out.println("Default value of boolVar = " + boolVar);

        System.out.println("Marks obtained are = "+marks);

    }
}
