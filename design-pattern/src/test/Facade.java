import com.aaron.design.pattern.structural.facade.AbstractFacade;
import com.aaron.design.pattern.structural.facade.Facade1;
import com.aaron.design.pattern.structural.facade.Facade2;

/**
 * Author wanglei
 * Created on 2020-03-13
 */
public class Facade {
    public static void main(String[] args) {
        AbstractFacade facade = new Facade1();
        facade.method1();
        facade.method2();
        facade = new Facade2();
        facade.method1();
        facade.method2();
    }
}
