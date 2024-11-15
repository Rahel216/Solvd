package hotelManagementSystem;

public class Employee extends Person {
    private double salary;
    private String job;
    
    public Employee(String name, int id, String contact, double salary, String job){
        super(name, id, contact);
        this.salary=salary;
        this.job=job;
    }

    public double getSalary(){
        return salary;
    }

    public String getjob(){
        return job;
    }

    public void setSalary(double salary){
        this.salary=salary;
    }

    public void setJob(String job){
        this.job=job;
    }

    public void print(){
        System.out.println("Name: "+ name);
        System.out.println("Id: "+ id);
        System.out.println("Contact: "+ contact);
        System.out.println("Salary: "+ salary);
        System.out.println("Job: "+ job);
    }
}