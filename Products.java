public class Products{

    private String item;
    private int quantity;
    private double price;

    public Product(String item, int quantity, double price){
        this.item = item;
        this.quantity = quantity;
        this.price = price;

    }

    public void setItem(String item){
        this.item = item;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setPrice(int price){
        this.price = price;
    }
}    
    