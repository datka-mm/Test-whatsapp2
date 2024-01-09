package task2;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Product {
        private String name;
        private String description;
        private BigDecimal price;
        private LocalDate madeOfDate;
        private ProductType productType;

        public Product(String name, String description, BigDecimal price, LocalDate madeOfDate, ProductType productType) {
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

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
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

