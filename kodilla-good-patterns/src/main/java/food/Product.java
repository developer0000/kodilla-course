package food;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    String name;

    BigDecimal price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}



