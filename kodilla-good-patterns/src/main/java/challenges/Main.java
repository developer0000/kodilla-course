package challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        Product klapki = new Product("Kubota", BigDecimal.valueOf(32.52));
        Product koszula = new Product("Armani", BigDecimal.valueOf(223.00));

        ProductOrderService productOrderService = new ProductOrderServiceImpl();
      //  productOrderService.order(klapki);

        List<Product> products = new ArrayList<>();
        products.add(klapki);
        products.add(koszula);

        for (int i=0; i < products.size(); i++){
            System.out.println(i+"."+products.get(i));

        }

        while (  2>1 ) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int i = Integer.parseInt(bufferedReader.readLine());
            productOrderService.order(products.get(i));
        }



    }
}
