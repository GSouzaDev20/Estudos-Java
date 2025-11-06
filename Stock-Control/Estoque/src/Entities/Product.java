package Entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueinStock(){
        return price * quantity;
    }
    public void addQuantity(int quantity){
        this.quantity += quantity;
    }
    public void removeQuantity(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", (price))
                + ", "
                + String.format("%d", (quantity))
                + ", units, Total: "
                + String.format("%.2f", totalValueinStock());
    }

}
