package shop;


public class Cart {
    private String[] items;
    private double amount;

    public Cart(String[] items, double amount){
        this.items = items;
        this.amount = amount;
    }


    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
