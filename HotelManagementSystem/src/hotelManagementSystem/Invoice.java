package hotelManagementSystem;

public class Invoice {
    private int invoiceId;
    private Booking booking;
    private Payment payment;

    public Invoice(int invoiceId, Booking booking, Payment payment) {
        this.invoiceId = invoiceId;
        this.booking = booking;
        this.payment = payment;
    }


    public int getInvoiceId() {
        return invoiceId;
    }

    public Booking getBooking() {
        return booking;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId=invoiceId;
    }

    public void setBooking(Booking booking) {
        this.booking=booking;
    }

    public void setPayment(Payment payment) {
        this.payment=payment;
    }
}