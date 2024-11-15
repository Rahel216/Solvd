package hotelManagementSystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation{
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    private double price;
    private String status;
    private Person person;
    private Room room;
    private DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Reservation(LocalDate arrivalDate, LocalDate departureDate, double price, String status, Person person, Room room){
        this.arrivalDate=arrivalDate;
        this.departureDate=departureDate;
        this.price=price;
        this.status=status;
        this.person=person;
        this.room=room;
    }

    public LocalDate getArrivalDate(){
        return arrivalDate;
    }
    
    public String getArrivalDatetoString(){
        return arrivalDate.format(formatter);
    }

    public void setArrivalDate(LocalDate arrivalDate){
        this.arrivalDate=arrivalDate;
    }

    public LocalDate getDepartureDate(){
        return departureDate;
    }

    public String getDepartureDatetoString(){
        return departureDate.format(formatter);
    }

    public void setDepartureDate(LocalDate departureDate){
        this.departureDate=departureDate;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status=status;
    }

    public Person getPerson(){
        return person;
    }

    public void setPerson(Person person){
        this.person=person;
    }

    public Room getRoom(){
        return room;
    }

    public void setRoom(Room room){
        this.room=room;
    }
}