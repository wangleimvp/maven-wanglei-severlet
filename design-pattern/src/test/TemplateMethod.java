import com.aaron.design.pattern.behavioral.template.AbstractClass;
import com.aaron.design.pattern.behavioral.template.ConcreteClass;

/**
 * Author wanglei
 * Created on 2020-03-15
 */
public class TemplateMethod {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
    }
}
