package hotelManagementSystem;

public class HotelCleaner extends Employee {
    private int roomsCleaned;

    public HotelCleaner(String name, int id, String contact, double salary, String job, int roomsCleaned) {
        super(name, id, contact, salary, job);
        this.roomsCleaned = roomsCleaned;
    }

    public int getRoomsCleaned() {
        return roomsCleaned;
    }

    public void setRoomsCleaned(int roomsCleaned) {
        this.roomsCleaned = roomsCleaned;
    }

    public void cleanRoom(String roomNumber) {
        System.out.println("Cleaner " + getName() + " is cleaning room " + roomNumber);
        roomsCleaned++;
    }

    @Override
    public String toString() {
        return "Rooms Cleaned: " + roomsCleaned;
    }
}
