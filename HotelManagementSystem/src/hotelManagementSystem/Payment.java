package hotelManagementSystem;

public class Payment {
    private int paymentId;
    private double amount;
    private String paymentDate;

    public Payment(int paymentId, double amount, String paymentDate) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId=paymentId;
    }

    public void setAmount(double amount) {
        this.amount=amount;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate=paymentDate;
    }
}
