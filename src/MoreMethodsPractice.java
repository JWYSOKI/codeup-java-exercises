import java.util.Scanner;

public class MoreMethodsPractice {
// When writing java code, the name of the class should be the same as the name of the file. Here, the class is named MoreMethodsPractice //



    public static Scanner scanner = new Scanner(System.in);

    public static int add (int num1, int num2){
        return num1 + num2;
    }

    public static int subtract (int num1, int num2){
        return num1 - num2;
    }

    public static int multiple (int num1, int num2){
        return num1 * num2;
    }

    public static int divide (int num1, int num2){
        return num1 / num2;
    }


    public static int modulus (int num1, int num2){
        return num1 % num2;
    }


// Create a method that validates that user input is in a certain range

// 1. Set up a public, static String and name it.
        public static String range (int min, int max){


// 2. Set an int variable and name it
        int userInput;


// 3. Prompt the user
        System.out.println("Enter a number between " + min + " and " + max );


// 4. Scan for number entered by user
        userInput = scanner.nextInt();



// 5. Create a conditional statement that sets the parameter limits
        if (userInput < min || userInput > max)



// 6. Tell the user their number is out of range
        System.out.println("That is out of range!");



// 7. Create a recursive statement that loops back to the beginning if out of scope
        range(min, max);


// 8. Return a string that tells the user their number is in range
        return "That number is in range";

}







// This calls all the methods on my class of MoreMethodsPractice
    public static void main(String[] args) {
        System.out.println(add(7,7));
        System.out.println(subtract(7,7));
        System.out.println(multiple(7,7));
        System.out.println(divide(9,3));
        System.out.println(modulus(8,4));
        System.out.println(range(2,12));




    }
}

