import com.aaron.design.pattern.behavioral.chain.ConcreteHandler1;
import com.aaron.design.pattern.behavioral.chain.ConcreteHandler2;
import com.aaron.design.pattern.behavioral.chain.Handler;

/**
 * Author wanglei
 * Created on 2020-03-15
 */
public class ChainOfResponsibility {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        handler1.handleRequest("one");
        handler1.handleRequest("two");
        handler1.handleRequest("three");
    }
}
