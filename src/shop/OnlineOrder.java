package shop;

public class OnlineOrder extends Order implements IPaymentProccessor, INotificationService, IReservationService {
    public OnlineOrder(Cart cart){
        super(cart);
    }

    public void CheckOut(){
        System.out.println("Checking out ONLINE ORDER");
    }

    public void processCreditCard(){
        System.out.println("Proccessing CREDIT CARD payment from ONLINE ORDER:");
        System.out.println("Getting credit card data from data store");
        System.out.println("Showing user success message");
    }

    public void reserveInventory(){
        System.out.println("ONLINE ORDER RESERVING INVENTORY");
    }

    public void notifyCustomer(){
        System.out.println("ONLINE ORDER sendin EMAIL to customer");
    }

    public String toString(){
        return "ONLINE ORDER";
    }
}
