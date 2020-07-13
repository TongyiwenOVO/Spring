import com.controller.accountController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("annocaction.xml");
        accountController accountController=ac.getBean(com.controller.accountController.class);
        accountController.select();
    }
}
