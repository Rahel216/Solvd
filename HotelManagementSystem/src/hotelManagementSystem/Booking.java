package hotelManagementSystem;

public class Booking {
    private int bookingId;
    private Customer customer;
    private Room room;
    private String checkInDate;
    private String checkOutDate;

    public Booking(int bookingId, Customer customer, Room room, String checkInDate, String checkOutDate) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public int getBookingId() {
        return bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setBookingId(int bookingId) {
        this.bookingId=bookingId;
    }

    public void setCustomer(Customer customer) {
        this.customer=customer;
    }

    public void setRoom(Room room) {
        this.room=room;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate=checkInDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate=checkOutDate;
    }
}