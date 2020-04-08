import com.aaron.spi.Robot;
import org.junit.Test;

import java.util.ServiceLoader;

/**
 * Author wanglei
 * Created on 2020-04-08
 */
public class JavaSPITest {
    @Test
    public void sayHello() throws Exception {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }
}
