package hotelManagementSystem;

public class Customer extends Person {
    
    public Customer(String name, int id, String contact){
        super(name, id, contact);
    }
   
    public void print(){
        System.out.println("Name: "+ name);
        System.out.println("Id: "+ id);
        System.out.println("Contact: "+ contact);
    }
}