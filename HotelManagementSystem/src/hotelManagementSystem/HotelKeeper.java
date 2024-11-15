package hotelManagementSystem;

class HotelKeeper extends Employee {
    private int assignedFloor;

    public HotelKeeper(String name, int id, String contact, double salary, String job, int assignedFloor) {
        super(name, id, contact, salary, job);
        this.assignedFloor = assignedFloor;
    }

    public int getAssignedFloor() {
        return assignedFloor;
    }

    public void setAssignedFloor(int assignedFloor) {
        this.assignedFloor=assignedFloor;
    }
}