import com.aaron.design.pattern.behavioral.visitor.*;

/**
 * Author wanglei
 * Created on 2020-03-19
 */
public class VisitorPattern {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.add(new ConcreteElementA());
        structure.add(new ConcreteElementB());
        structure.accept(new ConcreteVisitorA());
        System.out.println("----------");
        structure.accept(new ConcreteVisitorB());
    }
}
