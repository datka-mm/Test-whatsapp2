package task2;

import java.time.LocalDate;

public interface Products {
    String ProductName(String name);
    String Type(ProductType productType);
    LocalDate Vegetables(LocalDate vegetables);
    LocalDate Electronics(LocalDate electronics);
}
