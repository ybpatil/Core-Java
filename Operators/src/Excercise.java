
import java.util.Scanner;

public class Excercise {
    public static void main(String[] args) {

/* Q1: (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
a double value from the console, then converts it to Fahrenheit and displays the
result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32 */

//        double tempC, tempF;
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter temp in Celsius : ");
//        tempC = input.nextDouble();
//
//        tempF = tempC * 1.8 + 32;
//        System.out.println("Temp is = "+ tempF + " F");


/*Q2: (Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * pi
volume = area * length */

//        int r, l, area, volume;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter radius : ");
//        r = in.nextInt();
//        System.out.print("Enter length : ");
//        l = in.nextInt();
//
//        area = r*r*l;
//        System.out.println("Area of the cylinder is = " + l);
//
//        volume = area * l;
//        System.out.print("Volume of cylunder is = " + volume);

/*Q3. (Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total. */

//        double gratuityRate, subtotal, total, calculateGratuity;
//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter gratuity rate : ");
//        gratuityRate = in.nextDouble();
//        System.out.print("Enter subtotal : ");
//        subtotal = in.nextDouble();
//
//        calculateGratuity = subtotal * (gratuityRate / 100);
//        System.out.println("Gratuity = " + calculateGratuity);
//
//        total = subtotal + calculateGratuity;
//        System.out.println("The Gratuity is $= "+ calculateGratuity + " and totalAmount is $= " + total);

/*Q4. (Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. For example, if an integer is 932, the
sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the
extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93 */

//        Scanner input = new Scanner(System.in);		// Create new Scanner object
//
//        // Prompt the user to enter a number between 0 and 1000.
//        System.out.print("Enter a number between 0 and 1000: ");
//        int number = input.nextInt();
//
//        // Compute the sum of the digits in the integer.
//        int lessThan10 = number % 10;		// Extract the digit less than 10
//        number /= 10;							// Remove the extracted digit
//        int tens = number % 10;				// Extract the digit between 10 to 99
//        number /= 10;							// Remove the extracted digit
//        int hundreds = number % 10;		// Extract the digit between 100 to 999
//        number /= 10;							// Remove the extracted digit
//        int sum = hundreds + tens + lessThan10;
//
//        // Display results
//        System.out.println("The sum of the digits is " + sum);

/* Q5. (Find the number of years) Write a program that prompts the user to enter the
minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
For simplicity, assume a year has 365 days. */

//
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter number of minutes: ");
//
//        int numOfMinutes = in.nextInt();
//
//        int hour = 60;
//        int day = 60 * 24;
//        int year = day * 365;
//
//        int numOfYears = numOfMinutes / year;
//        int numOfDays = (numOfMinutes % year) / day;
//
//        System.out.println("Number of years = "+ numOfYears + " and Number of days = " + numOfDays);

/*
Q6: (Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
that one pound is 0.45359237 kilograms and one inch is 0.0254 meters. */

        Scanner in = new Scanner(System.in);
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0833333;

        System.out.print("Input weight in pounds :"); 		// Prompt the user to enter a weight in pounds
        double weight = in.nextDouble();
        System.out.print("Input height in meters :"); 		// Prompt the user to enter height in inches
        double height = in.nextDouble();

        weight = weight * KILOGRAMS_PER_POUND; 		// Convert weight to kilograms
        height= height * METERS_PER_INCH; 		// Convert height to meters

        double bmi = weight / Math.pow(height, 2);
        System.out.println("BMI = "+ bmi);






    }
}

