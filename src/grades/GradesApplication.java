package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        initApp();
    }

    public static void initApp() {
        HashMap<String, Student> students = new HashMap<>();
        Student student1 = new Student("Jane");
        Student student2 = new Student("Sally");
        Student student3 = new Student("John");
        Student student4 = new Student("Robert");

        student1.addGrade(71);
        student1.addGrade(70);
        student1.addGrade(75);

        student2.addGrade(92);
        student2.addGrade(95);
        student2.addGrade(99);

        student3.addGrade(56);
        student3.addGrade(57);
        student3.addGrade(52);

        student4.addGrade(87);
        student4.addGrade(89);
        student4.addGrade(12);

        students.put("janedeux", student1);
        students.put("sallyhutchison", student2);
        students.put("johndough", student3);
        students.put("robertbrown", student4);
    }

public static void promptUserToContinue() {
    HashMap<String, Student> students = new HashMap<>();

    System.out.println("Welcome!\n");
    System.out.println("Here are the github usernames of our students: \n");
    System.out.println(students.keySet());
    System.out.println("\nWhich student would you like to see more information on?\n");

    Input input = new Input();
    String userInput = input.getString();

    if (!students.containsKey(userInput)) {
        System.out.println("Sorry, no student found with the github username of " + userInput);
    }

    if (students.containsKey(userInput)) {
        String name = students.get(userInput).getName();
        double gradeAverage = students.get(userInput).getGradeAverage();
        System.out.println("Name: " + name + " - Github Username: " + userInput + "\nCurrent Average: " + gradeAverage);
    } else
        System.out.println("Goodbye and have a good day");
    }

}


