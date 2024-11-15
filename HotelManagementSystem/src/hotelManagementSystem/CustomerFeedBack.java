package hotelManagementSystem;

public class CustomerFeedBack {
    private String feedbackID;
    private Customer customer;
    private String feedbackText;
    private int rating; 

   
    public CustomerFeedBack(String feedbackID, Customer customer, String feedbackText, int rating) {
        this.feedbackID = feedbackID;
        this.customer = customer;
        this.feedbackText = feedbackText;
        this.rating = rating;
    }

    
    public String getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(String feedbackID) {
        this.feedbackID = feedbackID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating. Please provide a rating between 1 and 5.");
        }
    }

    public void displayFeedback() {
        System.out.println("Feedback ID: " + feedbackID);
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Feedback: " + feedbackText);
        System.out.println("Rating: " + rating + "/5");
    }
}
