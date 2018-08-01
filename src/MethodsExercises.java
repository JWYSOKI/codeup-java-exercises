//import java.util.Scanner;
//
//public class MethodsExercises {
//    public static Scanner scanner = new Scanner(System.in);

//Basic Arithmetic
//
//Create four separate methods. Each will perform an arithmetic operation:

//Addition

//    public static int add (int num1, int num2) {
//        return num1 + num2;
//    }
//////Subtraction

//    public static int sub (int num1, int num2) {
//        return num1 - num2;
//    }

//////Multiplication

//    public static int mul (int num1, int num2) {
//        return num1 * num2;
//    }

//////Multiplication without * operator

//    public static int mul2 (int num1, int num2) {
//       int total = 0;
//       for(int i=1; i<=num2; i++){
//           total += num1;
//       }
//       return total;
//    }

//////Division

//    public static int div (int num1, int num2) {
//        return num1 / num2;
//    }

//////Modulus function that finds the modulus of two numbers

//    public static int mod (int num1, int num2) {
//        return num1 % num2;
//    }

////// Create a method that validates that user input is in a certain range
//    public static String range (int min, int max){
//        int userInput;
//
//        System.out.println("Enter a number between " + min + " and " + max);
//        userInput= scanner.nextInt();
//
//        if(userInput < min || userInput > max){

//////======= ****** THIS IS RECURSION ****** ========= !!!!!
//          range(min, max);
//
//        }
//        return "This is in range";
//    }


// //Exercise 3 - Calculate the factorial of a number

//This line is a method named String
//    public static void CalculateFactorial (){


//This line prompts the user
//     System.out.println("Enter a # between 1 - 10");

//This line scans for when user enters an integer
//     int NumberToFactorialize = scanner.nextInt();

//This line checks/verifies if number entered is out of range
//     if(NumberToFactorialize <1 || NumberToFactorialize >10){


////This line tells user their number was out of range
//     System.out.println("Number is out of range. ");

////Because number was out of range, this line starts method over via RECURSION
//         CalculateFactorial();

//// This is the closing curly brace for this method
//     }

////This assigns values to variable data type "long" named factorial
//     long factorial = 1;

//     for (int i = 1; i<=NumberToFactorialize; i++){

//         factorial = factorial * i;
//     }

//     System.out.println(factorial);
// }

//// ******* Main method that calls ALLLLLLLLL the methods on my class
//    public static void main(String[] args) {
//        System.out.println(add(5,9));
//        System.out.println(sub(5,9));
//        System.out.println(mul(5,9));
//        System.out.println(div (5,9));
//        System.out.println(mod(5,9));
//        System.out.println(range(2,11));
//
//    }
//}

//With recursion






