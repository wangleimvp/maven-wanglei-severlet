import com.aaron.design.pattern.behavioral.strategy.*;

/**
 * Author wanglei
 * Created on 2020-03-15
 */
public class TestStrategy {
    public static void main(String[] args) {
        System.out.println("下面是上下文策略：");
        Context context = new Context();
        Strategy strategyA = new ConcreteStrategyA();
        context.setStrategy(strategyA);
        context.strategyMethod();
        Strategy strategyB = new ConcreteStrategyB();
        context.setStrategy(strategyB);
        context.strategyMethod();
        System.out.println("下面是策略工厂模式：");
        StrategyFactory.put("strategyA", strategyA);
        StrategyFactory.put("strategyB", strategyB);
        StrategyFactory.strategyMethod("strategyA");
        StrategyFactory.strategyMethod("strategyB");
        StrategyFactory.strategyMethod("strategyC");
    }
}
