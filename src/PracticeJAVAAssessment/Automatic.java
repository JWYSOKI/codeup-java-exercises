package PracticeJAVAAssessment;

public class Automatic extends Car implements Vehicle{
    public Automatic() {
    }

    public String Drive(){
        return "Automatically shifting";
    }

    public static void main(String[] args) {
    Automatic automatic = new Automatic();
        System.out.println(automatic.Drive());
    }
}
