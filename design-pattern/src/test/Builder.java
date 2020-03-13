import com.aaron.design.pattern.creational.builder.*;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public class Builder {
    public static void main(String[] args) {
        AbstractBuilder builder1 = new ConcreteBuilder1();
        AbstractBuilder builder2 = new ConcreteBuilder2();
        Director director = new Director(builder2);
        Product product = director.construct();
        product.show();
    }
}
