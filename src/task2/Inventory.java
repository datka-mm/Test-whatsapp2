package task2;

import java.time.LocalDate;
import java.time.Period;

public class Inventory implements Products {
    private Product[] products;

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String ProductName(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                return name;
            }
        }
        return "Invalit name";
    }

    @Override
    public String Type(ProductType productType) {
        for (Product p : products) {
            if (p.getProductType().equals(productType)){
                return productType.toString();
            }
        }
        return "Invalit ptoduct name";
    }

    @Override
    public LocalDate Vegetables(LocalDate vegetables) {
//        for (Product p: products) {
//            Period.between()
//        }
        return null;
    }

    @Override
    public LocalDate Electronics(LocalDate electronics) {
        return null;
    }
}

