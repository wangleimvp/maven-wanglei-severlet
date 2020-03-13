import com.aaron.design.pattern.creational.prototype.ProtoTypeManager;
import com.aaron.design.pattern.creational.prototype.Shape;

/**
 * Author wanglei
 * Created on 2020-03-12
 */
public class ProtoTypeShape {

    public static void main(String[] args) {
        ProtoTypeManager pm = new ProtoTypeManager();
        Shape obj1 = pm.getShape("Circle");
        obj1.countArea();
        Shape obj2 = pm.getShape("Square");
        obj2.countArea();
    }
}
