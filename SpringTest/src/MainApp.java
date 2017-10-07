import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Testing obj = (Testing) context.getBean("testing");
        obj.getMessage();
        context.registerShutdownHook();
    }
}