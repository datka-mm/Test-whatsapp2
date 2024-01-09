package product;

import lombok.*;

import java.time.LocalDate;

public class Product {

    private String name;
    private String description;
    private int price;
    private LocalDate madeOfDate;
    private ProductType productType;


    public Product(String name, String description, int price, LocalDate madeOfDate, ProductType productType) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.madeOfDate = madeOfDate;
        this.productType = productType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getMadeOfDate() {
        return madeOfDate;
    }

    public void setMadeOfDate(LocalDate madeOfDate) {
        this.madeOfDate = madeOfDate;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", madeOfDate=" + madeOfDate +
                ", productType=" + productType +
                '}';
    }
}
