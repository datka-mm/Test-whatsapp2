package product;

import java.util.Arrays;

public class Inventory implements SearchAble {

    private Product[] products;

    public Inventory(Product[] products) {
        this.products = products;
    }

    @Override
    public Product findProductByName(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                return p;
            }
        }

        return null;
    }

    @Override
    public Product findProductByProductType(ProductType type) {
        return null;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "products=" + Arrays.toString(products) +
                '}';
    }
}
