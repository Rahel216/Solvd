package hotelManagementSystem;

public class Inventory{
    private String itemName;
    private int quantity;
    private String supplier;

    public Inventory(String itemName, int quantity, String supplier){
        this.itemName=itemName;
        this.quantity=quantity;
        this.supplier=supplier;
    }

    public String getItemName(){
        return itemName;
    }

    public void setItemName(String itemName){
        this.itemName=itemName;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public String getSupplier(){
        return supplier;
    }

    public void setSupplier(String supplier){
        this.supplier=supplier;
    }
}