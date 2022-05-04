package food;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Client client =  new Client("Krakow","Pawel", "Kowalski");

        Supplier supplier = new ExtraFoodShop(" food","warszawa", Map.of(new Product("klapki", BigDecimal.valueOf(20.01)),2)) ;

        Order order = new Order(1,Map.of(new Product("klapki", BigDecimal.valueOf(20.01)),2)) ;

         Dystrybutor dystrybutor = new Dystrybutor(List.of(supplier),List.of(order),List.of(client))   ;

          dystrybutor.processing();


    }
}
