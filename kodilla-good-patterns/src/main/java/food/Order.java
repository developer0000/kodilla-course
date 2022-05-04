package food;

import java.util.HashMap;
import java.util.Map;

public class Order {
    int id;

    Map<Product,Integer> orders = new HashMap<>();


    public Order(int id, Map<Product, Integer> orders) {
        this.id = id;
        this.orders = orders;
    }
}
