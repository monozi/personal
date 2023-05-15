package ClassPack;

public class Employee {
    private String name;
    private String jobTitle;
    private int attendance;
    private double salary;

    public Employee(String name, String jobTitle, int attendance, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.attendance = attendance;
        this.salary = salary;
    }
    public String getName() {
        return name;
    } 
    public String getJobtitle() {
        return jobTitle;
    }
    public int getAttendance() {
        return attendance;
    }
    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setJobtitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void updateSalary() {
        this.salary = this.salary * this.attendance;
    }
}
