import com.aaron.design.pattern.structural.flyweight.Flyweight;
import com.aaron.design.pattern.structural.flyweight.FlyweightFactory;
import com.aaron.design.pattern.structural.flyweight.UnsharedConcreteFlyweight;

/**
 * Author wanglei
 * Created on 2020-03-13
 */
public class TestFlyweight {
    public static void main(String[] args) {
        FlyweightFactory factory=new FlyweightFactory();
        Flyweight f01=factory.getConcreteFlyweight1("a");
        Flyweight f02=factory.getConcreteFlyweight1("a");
        Flyweight f11=factory.getConcreteFlyweight1("b");
        Flyweight f12=factory.getConcreteFlyweight1("b");
        f01.operation(new UnsharedConcreteFlyweight("第1次调用a。"));
        f02.operation(new UnsharedConcreteFlyweight("第2次调用a。"));
        f11.operation(new UnsharedConcreteFlyweight("第1次调用b。"));
        f12.operation(new UnsharedConcreteFlyweight("第2次调用b。"));

        Flyweight f21=factory.getConcreteFlyweight2("A");
        Flyweight f22=factory.getConcreteFlyweight2("A");
        Flyweight f31=factory.getConcreteFlyweight2("B");
        Flyweight f32=factory.getConcreteFlyweight2("B");
        f21.operation(new UnsharedConcreteFlyweight("第1次调用a。"));
        f22.operation(new UnsharedConcreteFlyweight("第2次调用a。"));
        f31.operation(new UnsharedConcreteFlyweight("第1次调用b。"));
        f32.operation(new UnsharedConcreteFlyweight("第2次调用b。"));
    }
}
