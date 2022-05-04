package food;

import java.util.ArrayList;
import java.util.List;

public class Dystrybutor {

    List<Supplier> dostawcy = new ArrayList<>();
    List<Order>  zamowienia = new ArrayList<>();
    List <Client> klienci = new ArrayList<>();

    public Dystrybutor(List<Supplier> dostawcy, List<Order> zamowienia, List<Client> klienci) {
        this.dostawcy = dostawcy;
        this.zamowienia = zamowienia;
        this.klienci = klienci;
    }


    public void  processing ( ) {

        zamowienia.stream().forEach(z -> {
            z.orders.forEach((key,value)->{
                try {
                   Supplier supplier = dostawcy.stream().filter(d-> d.products.get(key)>=value ).findFirst().orElseThrow(()->new NoProductException("Product doesn't exist"));
                   supplier.proccess(key,value);
                } catch (NoProductException e) {
                    e.printStackTrace();
                }
            });

        });

    }

    public void addSupplier ( Supplier supplier){
        this.dostawcy.add(supplier);

    }
    public void addOrder (Order order) {
        this.zamowienia.add(order);
    }

    public void addClient (Client client) {
        this.klienci.add(client);
    }


}
