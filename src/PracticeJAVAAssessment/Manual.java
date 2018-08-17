package PracticeJAVAAssessment;

public class Manual extends Car {

    public Manual() {
    }

    public String Drive(){
        return "Shifting Required";
    }

    public Manual(String make, String model, int year) {
        super(make, model, year);
    }

    public static void main(String[] args) {
        Manual manual = new Manual();
        Manual manual1 = new Manual("Toyota", "Prius", 2018);
        System.out.println(manual.Drive());
        System.out.println(manual1.make);


    }

}
