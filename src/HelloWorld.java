public class HelloWorld {

    public static void main (String[] args){
//        System.out.println("Hello World!");
//        System.out.println();
//
//        System.out.print("Hello ");
//                System.out.print("World!");
//CHRIS: ****** Try renaming the main method. What happens when you try to run the program?

// Syntax, Types, and Variables

// Exercise 1. Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
//        int myFavoriteNumber = 13;
//        System.out.println(myFavoriteNumber);

// Exercise 2. Create a String variable named myString and assign a string value to it, then print the variable out to the console.

//        String myString = "3.14159";
//        System.out.println(myString);


// Exercise 3. Change your code to assign a character value to myString. What do you notice?



// Exercise 4. Change your code to assign the value 3.14159 to myString. What happens?

// Exercise 5. Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?

// Exercise 6. Change your code to assign the value 3.14 to myNumber. What do you notice?
//DONE


// Exercise 7. Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

// Exercise 8. Change your code to assign the value 123 to myNumber. Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

// Exercise 9. Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

//        float myNumber = (float) 3.14E00;
//        System.out.println(myNumber);

// Exercise 10. Copy and paste the following code blocks one at a time and execute them

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

// Exercise 11. Try to create a variable named class. What happens?



//Exercise 12. Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;


// Copy and paste the code above and then run it. Does the result match with your expectation? How is the above example different from this code block?

//        int three = (int) "three";

// Exercise 13. Rewrite the following expressions using the relevant shorthand assignment operators:

//        int x = 4;
//        x += 5;
//
//        int x = 3;
//        int y = 4;
//        y *= x;
//
//
//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;

// Exercise 14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
        byte a = 127;
        ++a;
        System.out.println(a);

// Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.


    }
}
