package food;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Client client =  new Client("Pawel","Pawel", "PAwel");

        Supplier supplier = new ExtraFoodShop(" a","b", Map.of(new Product("klapki", BigDecimal.valueOf(20.01)),2)) ;

        Order order = new Order(1,Map.of(new Product("klapki", BigDecimal.valueOf(20.01)),2)) ;

         Dystrybutor dystrybutor = new Dystrybutor(List.of(supplier),List.of(order),List.of(client))   ;

          dystrybutor.processing();


    }
}
