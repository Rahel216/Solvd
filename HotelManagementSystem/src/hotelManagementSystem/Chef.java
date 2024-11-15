package hotelManagementSystem;

public class Chef extends Employee {
    private String specialty;

    public Chef(String name, int id, String contact, double salary, String job, String specialty) {
        super(name, id, contact, salary, job);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty=specialty;
    }
}