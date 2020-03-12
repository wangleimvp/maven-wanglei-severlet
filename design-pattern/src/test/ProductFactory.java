import com.aaron.design.pattern.factory.*;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public class ProductFactory {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();
        ConcreteFactory3 factory3 = new ConcreteFactory3();
        Product product1 = factory1.newProduct();
        Product product2 = factory2.newProduct();
        Product product3 = factory3.newProduct1();
        Product product4 = factory3.newProduct2();
        List<Product> products = Lists.newArrayList(product1, product2, product3, product4);
        for (Product product : products) {
            product.show();
        }
    }
}
