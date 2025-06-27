package lists.exBasics.ex02;

public class Main {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem("Xbox series X", 2500d, 1);
        shoppingCart.addItem("Playstation 5", 3000d, 1);
        shoppingCart.addItem("Nintendo", 1000d, 3);

        System.out.println("All items " + shoppingCart.showItems());
        System.out.println("Total value: R$" + shoppingCart.totalValue());

        shoppingCart.removeItem("Nintendo");
    }
}
