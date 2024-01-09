package product;

public interface SearchAble {

    Product findProductByName(String name);

    Product findProductByProductType(ProductType type);
}
