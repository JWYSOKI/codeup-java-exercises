public class Manager extends Employee {
    public Manager() {
    }

    public Manager(int emp_id, String first_name, String last_name, int hire_year, double salary, Department department) {
        super(emp_id, first_name, last_name, hire_year, salary, department);
    }

    public static void main(String[] args) {
        Manager manager = new Manager(321, "Samuel", "Jackson", 2008, 230000, department5);
        System.out.println(manager.getJob_description());
        System.out.println(manager.getEmployeeDetails());
        System.out.println(manager.previousJobDescription());
    }

    public String getJob_description() {
        return "manages the " + department.getDepartment() + " department.";
    }

    public String getEmployeeDetails() {
        return first_name + " " + last_name + "'s" + " is managing the " + department.getDepartment() + " department. " + first_name + " has been with the company since " + hire_year + " and gets paid " + salary + " per year.";

    }

    public String previousJobDescription(){
        return super.department.getJob_description();
    }

}