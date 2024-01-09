package product;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Product product = new Product("Apple", "Green", 12, LocalDate.of(2022, 12, 12), ProductType.VEGETABLES);
        Product product2 = new Product("Phone", "Black", 12, LocalDate.of(2022, 2, 12), ProductType.ELECTRONIC);
        Inventory inventory = new Inventory(new Product[] {product2, product});
        System.out.println(inventory.findProductByName("Apple"));
    }
}
