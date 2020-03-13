import com.aaron.design.pattern.structural.decorator.Component;
import com.aaron.design.pattern.structural.decorator.ConcreteComponent;
import com.aaron.design.pattern.structural.decorator.ConcreteDecorator1;
import com.aaron.design.pattern.structural.decorator.ConcreteDecorator2;

/**
 * Author wanglei
 * Created on 2020-03-13
 */
public class Decorator {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        Component decorator = new ConcreteDecorator1(component);
        decorator.operation();
        decorator = new ConcreteDecorator2(component);
        decorator.operation();
    }
}
