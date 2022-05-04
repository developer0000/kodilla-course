package food;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Supplier {

    private String companyName;
    private String address;

    Map<Product,Integer> products = new HashMap<>();




    public abstract void proccess( Product product,Integer quantity) ;


    public Supplier(String companyName, String address, Map<Product, Integer> products) {
        this.companyName = companyName;
        this.address = address;
        this.products = products;
    }
}
