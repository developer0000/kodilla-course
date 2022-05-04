package food;

import java.util.HashMap;
import java.util.Map;

public class Order {
    int id;

    private Map<Product,Integer> orders;


    public Map<Product, Integer> getOrders() {
        return orders;
    }

    public Order(int id, Map<Product, Integer> orders) {
        this.id = id;
        this.orders = orders;
    }
}
