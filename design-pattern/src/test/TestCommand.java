import com.aaron.design.pattern.behavioral.command.Command;
import com.aaron.design.pattern.behavioral.command.ConcreteCommandA;
import com.aaron.design.pattern.behavioral.command.ConcreteCommandB;
import com.aaron.design.pattern.behavioral.command.Invoker;

/**
 * Author wanglei
 * Created on 2020-03-15
 */
public class TestCommand {
    public static void main(String[] args) {
        Command command = new ConcreteCommandA();
        Invoker invoker = new Invoker(command);
        invoker.call();
        invoker.setCommand(new ConcreteCommandB());
        invoker.call();
    }
}
