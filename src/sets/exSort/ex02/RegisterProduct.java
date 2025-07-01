package sets.exSort.ex02;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RegisterProduct {

    private Set<Product> productSet;

    public RegisterProduct() {
        this.productSet = new HashSet<>();
    }

    public void addProduct(String name, long code, double price, int quantity) {
        productSet.add(new Product(name, code, price, quantity));
    }

    public void showProductsByName() {
        verifyStorage();
        Set<Product> productsByName = new TreeSet<>(productSet);
        System.out.println(productsByName);
    }

    public void showProductsByPrice() {
        verifyStorage();
        Set<Product> productsByPrice = new TreeSet<>(new ComparatorProductByPrice());
        productsByPrice.addAll(productSet);
        System.out.println(productsByPrice);
    }

    public void verifyStorage() {
        if (productSet.isEmpty()) throw new RuntimeException("There is no product registered");
    }
}
