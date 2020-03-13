import com.aaron.design.pattern.structural.bridge.*;

/**
 * Author wanglei
 * Created on 2020-03-13
 */
public class Bridge {
    public static void main(String[] args) {
        Color colorRed = new Red();
        Color colorYellow = new Yellow();

        AbstractBag handBag = new HandBag();
        handBag.setColor(colorRed);
        System.out.println(handBag.getName());
        handBag.setColor(colorYellow);
        System.out.println(handBag.getName());

        AbstractBag wallet = new Wallet();
        wallet.setColor(colorRed);
        System.out.println(wallet.getName());
        wallet.setColor(colorYellow);
        System.out.println(wallet.getName());
    }
}
