package hotelManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Receptionist extends Employee {
    private List<String> handledBookings;

    public Receptionist(String name, int id, String contact, double salary, String job) {
        super(name, id, contact, salary, job);
        this.handledBookings = new ArrayList<>();
    }

    public List<String> getHandledBookings() {
        return handledBookings;
    }

    public void addHandledBooking(String bookingID) {
        handledBookings.add(bookingID);
    }

    public void checkInGuest(String bookingID) {
        System.out.println("Receptionist " + getName() + " is checking-in guest with Booking ID: " + bookingID);
        addHandledBooking(bookingID);
    }

    public void checkOutGuest(String bookingID) {
        System.out.println("Receptionist " + getName() + " is checking-out guest with Booking ID: " + bookingID);
        handledBookings.remove(bookingID);
    }

    @Override
    public String toString() {
        return "Handled Bookings: " + handledBookings;
    }
}
