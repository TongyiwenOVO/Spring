import com.controller.accountController;
import com.service.accountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        accountService accountService=ac.getBean(com.service.accountService.class);
        accountService.transfer("aaa","bbb",100f);
    }
}
