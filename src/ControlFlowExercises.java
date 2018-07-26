import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {


// Exercise 1.a. LOOP BASICS

//Create an integer variable i with a value of 5. Create a while loop that runs so long as i is less than or equal to 15. Each loop iteration, output the current value of i, then increment i by one.

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }


// Exercise 1.b. DO WHILE LOOP

// Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line

//        int i = 0;
//        do {
//            System.out.println(i);
//            i +=2;
//        } while (i <=100);


// Alter your loop to count backwards by 5's from 100 to -10.
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//
//        } while (i >= -10);

//Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000
//        long i = 2;
//
//        do {
//            System.out.println(i);
//            i *= i;
//
//        } while(i<= 1000000);

// Exercise 2.c. FOR LOOP
// Refactor the previous two exercises to use a for loop instead

//        for (long i = 1; i<=1000000; i*=i) {
//             System.out.println(i);
//        };



//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//for (int x =0; x<=15; x++){
//    System.out.println(x);
//}



// Exercise 2 = Fizzbuzz


//        for (int i = 1; i <=100; i+=1) {
//
//            if(i%15==0){
//                System.out.println("FizzBuzz");
//
//            } else if(i%3==0) {
//                System.out.println("Fizz");
//
//            } else if (i%5==0) {
//                System.out.println("Buzz");
//
//            } else
//                System.out.println(i);
//        }


// Exercise 3. Display a table of powers
Scanner scan = new Scanner(System.in);


//String goAgain;
//
//        do {
//            System.out.println("What number would you like to go up to?");
//
//            int userInput = scan.nextInt();
//
//            System.out.println("Here is your table: ");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            String pipe = "|";
//            for (int i = 1; i < userInput; i++) {
//                int num = i;
//                int numSqred = i * i;
//                int numCubed = i * i * i;
//                System.out.printf("%s %6s %s %7s %s \n", num, pipe, numSqred, pipe, numCubed);
//            }
//
//            System.out.println("Would you like to continue? [y,n]");
//            goAgain = scan.next();
//
//        } while (goAgain.equalsIgnoreCase("y"));



// Exercise 4.  Convert given number grades into letter grades.
      String goAgain;

do {
    System.out.println("Enter a number grade between 0 and 100");

    char grade = ' ';
    int usersGrade = scan.nextInt();

    if (usersGrade <= 100 && usersGrade >= 88) {
        grade = 'A';

    } else if (usersGrade <= 87 && usersGrade >= 80) {
        grade = 'B';

    } else if (usersGrade <= 79 && usersGrade >= 67) {
        grade = 'C';

    } else if (usersGrade <= 66 && usersGrade >= 60) {
        grade = 'D';
    } else if (usersGrade <= 59 && usersGrade >= 0) {
        grade = 'F';
    }
    System.out.println(grade);

    System.out.println("Would you like to continue [y, n]?");
    goAgain = scan.next();
} while (goAgain.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing!!");















    }
};

