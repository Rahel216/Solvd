package hotelManagementSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelManagementSystem {
    public static void main(String[] args) {
        Customer customer = new Customer("Kdus Abebe", 4567, "+251934576772");
        Room room = new Room(101, "Traditional", 300.0);
        Booking booking = new Booking(12, customer, room, "2024-11-01", "2024-12-05");
        Payment payment = new Payment(56, 10200.0, "2024-11-01");
    
        List<Invoice> invoices = new ArrayList<>();
        Accountant accountant = new Accountant("Enun", 5678, "+251985634", 6000.0, "Accountant", invoices, 0.0);
        accountant.generateInvoice(payment);
    
       List<Employee> employees = new ArrayList<>();
       employees.add(new Receptionist("Selam", 101, "+251678235", 3000.0, "Receptionist"));
       employees.add(new HotelCleaner("Melat", 102, "+251897645", 2500.0, "HotelCleaner", 0));
       accountant.calculatePayroll(employees);
       

       Notification notification = new Notification("Your booking has been confirmed. Thank you for choosing our hotel!", customer, new Date());
       notification.sendNotification();

       CustomerFeedBack feedback = new CustomerFeedBack("xyz12", customer, "Great service and comfortable stay!", 5);
       feedback.displayFeedback();

       Receptionist receptionist = new Receptionist("Selam", 123, "+251678235", 3000.0, "Receptionist");
       receptionist.checkInGuest("B001");
       receptionist.checkOutGuest("B001");

       HotelCleaner cleaner = new HotelCleaner("Melat", 532, "+251897645", 2500.0, "HotelCleaner", 0);
       cleaner.cleanRoom("101");
    
       System.out.println("Customer: " + customer.getName());
       System.out.println("Room Type: " + room.getType());
       System.out.println("Booking ID: " + booking.getBookingId());
       System.out.println("Total Amount: Birr " + payment.getAmount());
    }
}
        