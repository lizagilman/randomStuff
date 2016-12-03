package shop;

import java.util.*;

public class Shopping {
    public static void main(String[] args){
        Cart cart = new Cart(new String[]{"tuna", "bacon"}, 14.67);
        Order order1 = new OnlineOrder(cart);
        Order order2 = new PoSCashOrder(cart);
        Order order3 = new PoSCreditOrder(cart);
        Vector<Order> orders = new Vector<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        for (Order order: orders) {
            order.CheckOut();
        }
        System.out.println("");
        IPaymentProccessor obj1 = new OnlineOrder(cart);
        IPaymentProccessor obj2 = new PoSCreditOrder(cart);
        List<IPaymentProccessor> ccOrders = new ArrayList<>();
        ccOrders.add(obj1);
        ccOrders.add(obj2);
        for(IPaymentProccessor ccOrder: ccOrders){
            ccOrder.processCreditCard();
            System.out.println("");
        }

        Vector vec = new Vector();
        OnlineOrder obj11 = new OnlineOrder(cart);
        PoSCreditOrder obj22 = new PoSCreditOrder(cart);

        vec.add(obj11);
        vec.add(obj22);

        Enumeration vEnum = vec.elements();
        System.out.println("\nElements in vector:");

        while(vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + "\n");
    }
}
