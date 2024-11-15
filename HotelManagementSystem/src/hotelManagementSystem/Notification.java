package hotelManagementSystem;

import java.util.Date;

public class Notification {
    private String message;
    private Customer recipient;
    private Date sentDate;

    // Constructor
    public Notification(String message, Customer recipient, Date sentDate) {
        this.message = message;
        this.recipient = recipient;
        this.sentDate = sentDate;
    }

    // Getters
    public String getMessage() {
        return message;
    }

    public Customer getRecipient() {
        return recipient;
    }

    public Date getSentDate() {
        return sentDate;
    }

    // Setters
    public void setMessage(String message) {
        this.message = message;
    }

    public void setRecipient(Customer recipient) {
        this.recipient = recipient;
    }

    public void setSentDate(Date sentDate) {
        this.sentDate = sentDate;
    }

    // Method to display notification
    public void sendNotification() {
        System.out.println("Notification sent to: " + recipient.getName());
        System.out.println("Message: " + message);
        System.out.println("Sent on: " + sentDate);
    }
}