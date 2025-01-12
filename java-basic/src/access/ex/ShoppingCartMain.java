package access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("1",1,1);
        Item item2 = new Item("2",2,2);
        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }

}
