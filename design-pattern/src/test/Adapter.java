import com.aaron.design.pattern.structural.adapter.Adaptee;
import com.aaron.design.pattern.structural.adapter.ClassAdapter;
import com.aaron.design.pattern.structural.adapter.ObjectAdapter;
import com.aaron.design.pattern.structural.adapter.Target;

/**
 * Author wanglei
 * Created on 2020-03-13
 */
public class Adapter {
    public static void main(String[] args) {
        Target target1 = new ClassAdapter();
        target1.request();

        Adaptee adaptee = new Adaptee();
        Target target2 = new ObjectAdapter(adaptee);
        target2.request();
    }
}
