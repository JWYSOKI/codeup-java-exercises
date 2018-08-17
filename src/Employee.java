public class Employee extends Department {

    public Employee(){
        }

    int emp_id;
    String first_name;
    String last_name;
    int hire_year;
    double salary;
    Department department;

    public Employee(int emp_id, String first_name, String last_name, int hire_year, double salary, Department department) {
        this.emp_id = emp_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.hire_year = hire_year;
        this.salary = salary;
        this.department = department;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getHire_year() {
        return hire_year;
    }

    public void setHire_year(int hire_year) {
        this.hire_year = hire_year;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmployeeDetails(){
        return first_name + " " + last_name + " is in the " + department.getDepartment() + " where the job is " + department.getJob_description() + ". " + first_name + " has been with the company since " + hire_year + " and gets paid " + salary + " per year.";
    }




    public static Department department1 = new Department("Sales","selling Stuff");
    public static Department department2 = new Department("Marketing", "creating marketing materials");
    public static Department department3 = new Department("Design", "designing products");
   public static Department department4 = new Department("I.T", "fixing technical issues");
    public static Department department5 = new Department("Research", "conducting research");

    public static void main(String[] args) {

        Employee employee1 = new Employee(111,"Monique", "Washington",2018, 50000, department1);
        Employee employee2 = new Employee(222, "Angel", "Martinez", 2016, 200000, department2);
        Employee employee3 = new Employee(333, "Aki", "Chan", 2012, 100000, department3);
        Employee employee4 = new Employee(444, "Samuel", "Jackson", 2014, 500000, department4);
        Employee employee5 = new Employee(555, "La'akea", "Kelekolio", 2000, 250000, department5);

        Employee[] employees = new Employee[5];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;

        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeDetails());
        }
        





//        System.out.println(employee1.getEmployeeDetails());
//        System.out.println();
//        System.out.println(employee2.getEmployeeDetails());
//        System.out.println();
//        System.out.println(employee3.getEmployeeDetails());
//        System.out.println();
//        System.out.println(employee4.getEmployeeDetails());
//        System.out.println();
//        System.out.println(employee5.getEmployeeDetails());

    }

}
