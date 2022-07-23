import com.model.UserBean;
import com.user.UserRepository;
import com.user.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * https://wangzhi430.blog.csdn.net/article/details/125022322
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

//        UserBean userBean = context.getBean(UserBean.class);
//        UserBean userBean = (UserBean) context.getBean("userBean");
//        UserBean userBean = (UserBean) context.getBean("user1");
        UserBean userBean = context.getBean("user1",UserBean.class);

        userBean.printUserName("Hello Angela");



        ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");

        UserService service = context1.getBean("userService", UserService.class);
        UserRepository repository = context1.getBean("userRepository", UserRepository.class);
        service.sayHello("Jacky");
        repository.sayHello("Jim");


    }
}
