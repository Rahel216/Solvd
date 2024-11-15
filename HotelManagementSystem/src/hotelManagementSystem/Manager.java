package hotelManagementSystem;

class Manager extends Employee {
    private int experienceYears;

    public Manager(String name, int id, String contact, double salary, String job, int experienceYears) {
        super(name, id, contact, salary, job);
        this.experienceYears = experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears=experienceYears;
    }
}