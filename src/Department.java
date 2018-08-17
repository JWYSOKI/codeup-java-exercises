public class Department {

    String department;
    String job_description;

    public Department() {
    }



    public Department(String department, String job_description) {
        this.department = department;
        this.job_description = job_description;
    }

    public String getDepartment() {
        return department;
    }

    public String getJob_description() {
        return job_description;
    }
}
