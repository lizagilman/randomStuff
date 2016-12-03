package shop;


public class PoSCashOrder extends Order {
    public PoSCashOrder(Cart cart){
        super(cart);
    }

    public void CheckOut(){
        System.out.println("Checking out POS CASH ORDER");
    }
}