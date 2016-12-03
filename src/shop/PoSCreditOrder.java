package shop;

public class PoSCreditOrder extends Order implements IPaymentProccessor {
    public PoSCreditOrder(Cart cart){
        super(cart);
    }

    public void CheckOut(){
        System.out.println("Checking out POS CREDIT CARD order");
    }

    public void processCreditCard(){
        System.out.println("Proccessing CREDIT CARD payment from POS:");
        System.out.println("Taking credit card from customer");
        System.out.println("Passing Card");
    }

    public String toString(){
        return "POS CREDIT Order";
    }
}