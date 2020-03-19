import com.aaron.design.pattern.behavioral.observer.event.BellEventSource;
import com.aaron.design.pattern.behavioral.observer.event.StuEventListener;
import com.aaron.design.pattern.behavioral.observer.event.TeachEventListener;

/**
 * Author wanglei
 * Created on 2020-03-19
 */
public class BellEventTest {
    public static void main(String[] args) {
        BellEventSource bell=new BellEventSource();    //铃（事件源）
        bell.addPersonListener(new TeachEventListener()); //注册监听器（老师）
        bell.addPersonListener(new StuEventListener());    //注册监听器（学生）
        bell.ring(true);   //打上课铃声
        System.out.println("------------");
        bell.ring(false);  //打下课铃声
    }
}
