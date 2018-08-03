package grades;

import java.util.ArrayList;

public class Student {

//This declares the variables
    private String name;
    private ArrayList<Integer> grades;

//This is a constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
//This is a getter for name
    public String getName(){
        return name;
    }
//This adds grades array
    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for(Integer grade: grades){
                sum = sum + grade;
        }
        return Math.floor(sum / grades.size());
    }

    public static void main(String[] args) {
        Student student = new Student("Ryan");
        student.addGrade(82);
        student.addGrade(94);
        System.out.println(student.getGradeAverage());


    }
}
