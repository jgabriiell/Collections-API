package sets.exSort.ex02;

public class Main {
    public static void main(String[] args) {

        RegisterProduct registerProduct = new RegisterProduct();

        registerProduct.addProduct("PC Game", 123L, 2500d, 1);
        registerProduct.addProduct("Book", 456L, 50d, 2);
        registerProduct.addProduct("Whey Protein", 789L, 100d, 1);
        registerProduct.addProduct("SmartPhone", 258L, 1500d, 3);

        registerProduct.showProductsByName();
        registerProduct.showProductsByPrice();
    }
}
