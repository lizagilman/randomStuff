package shop;

abstract public class Order {
    private Cart cart;

    public Order(Cart cart){
        this.setCart(cart);
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    abstract void CheckOut();
}
