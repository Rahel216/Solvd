package hotelManagementSystem;

public class Person{
    protected String name;
    protected int id;
    protected String contact;

    public Person(String name, int id, String contact){
         this.name=name;
         this.id=id;
         this.contact=contact;
    }
    
    public String getName() {
        return name;
    }
 
    public int getId() {
        return id;
    }

    public String getContact() {
        return contact;
    }
    
    public void setName(String name){
        this.name=name;
    }

    public void setId(int id){
        this.id=id;
    }
  
    public void setContact(String contact){
        this.contact=contact;
    }
}
