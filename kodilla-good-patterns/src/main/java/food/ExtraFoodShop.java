package food;

import java.util.Map;

public class ExtraFoodShop extends Supplier{

    public ExtraFoodShop(String companyName, String address, Map<Product, Integer> products) {
        super(companyName, address, products);
    }

    @Override
    public void proccess(Product product, Integer quantity) {
        System.out.println("Zlecenie realizowane"); // nie zmniejsza sie stan productu
    }


}
