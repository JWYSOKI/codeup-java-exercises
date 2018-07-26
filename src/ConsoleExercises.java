import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {


//        double pi = 3.14159;
//
//        System.out.format("The value of pi is approximately %.2f%n",  pi);

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer ");
//        int userInput = scanner.nextInt();
//        System.out.printf("You entered the number %s", userInput);

//
//        System.out.println("Enter three words");
//
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//
//        System.out.println(firstWord);
//        System.out.println(secondWord);
//        System.out.println(thirdWord);

// Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method, then display that sentence back to the user.


//        System.out.println("Enter a sentence");
//
//        String userSentence = scanner.nextLine();
//
//        System.out.println(userSentence);

        System.out.println("Enter length");
        double length = scanner.nextDouble();
//        System.out.println(length);


        System.out.println("Enter width");
        double width = scanner.nextDouble();
        System.out.println(width);
        double area = length * width;
//        System.out.println(area);

        System.out.println("Enter height");
        double height = scanner.nextDouble();
        System.out.println(height);

        double perimeter = (length * 2) + (width * 2);
//        System.out.println(perimeter);

        double volume = length * width * height;

        System.out.printf("The area of the Codeup classroom is %s; The perimeter is %s; The volume is %s", area, perimeter, volume);




    }
}

