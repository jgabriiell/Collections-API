package lists.exBasics.ex02;

import lists.exceptions.EmptyStorageException;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity) {
        items.add(new Item(name, price, quantity));
    }

    public void removeItem(String name) {
        verifyStorage();
        items.removeIf(item -> item.getName().equalsIgnoreCase(name));
        System.out.println("Item removed successfully");
    }

    public double totalValue() {
        verifyStorage();
        double totalValue = 0d;
        for (Item item: items) {
            double itemValue = item.getPrice() * item.getQuantity();
            totalValue += itemValue;
        }
        return totalValue;
    }

    public List<Item> showItems() {
        verifyStorage();
        return this.items;
    }

    private void verifyStorage() {
        if (this.items.isEmpty()) throw new EmptyStorageException("There is no item in the cart");
    }
}
