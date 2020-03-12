import com.aaron.design.pattern.singleton.EnumSingleton;

public class TestSingleton {
    public static void main(String[] args) {
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.whateverMethod();
    }
}
