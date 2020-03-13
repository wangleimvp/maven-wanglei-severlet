import com.aaron.design.pattern.creational.factory.other.*;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public class AbstractProductFactory {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();
        Product1 product11 = factory1.newProduct1();
        Product2 product21 = factory1.newProduct2();
        Product1 product12 = factory2.newProduct1();
        Product2 product22 = factory2.newProduct2();
        product11.show();
        product21.show();
        product12.show();
        product22.show();
    }
}
