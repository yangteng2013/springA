import com.model.UserBean;
import com.user.*;
import com.user.bean.User;
import com.user.util.BeanLifecycleComponent;
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
        UserController controller = context1.getBean("userController", UserController.class);
        UserController1 controller1 = context1.getBean("userController1", UserController1.class);
        UserController2 controller2 = context1.getBean("userController2", UserController2.class);
        UserController5 controller5 = context1.getBean("userController5", UserController5.class);
        UserControllerA controllerA = context1.getBean("userControllerA", UserControllerA.class);
        UserControllerB controllerB = context1.getBean("userControllerB", UserControllerB.class);
        BeanLifecycleComponent beanLifecycleComponent = context1.getBean("beanLifeComponent", BeanLifecycleComponent.class);

        UserRepository repository = context1.getBean("userRepository", UserRepository.class);
        service.sayHello("Jacky");
        repository.sayHello("Jim");

//        User user = context1.getBean("getUser", User.class);
        User user = context1.getBean("u1", User.class);
        User user2 = context1.getBean("u2", User.class);
        System.out.println(user+" "+user.hashCode() + "  "+user2+" "+user2.hashCode());

        System.out.println(controller.findUserById(1));
        System.out.println(controller1.findUserById(2));
        System.out.println(controller2.findUserById(3));
        System.out.println(controller5.getUser());

        /**
         * Spring 中 Bean 的作用域默认是 singleton 单例模式. 所有人使用的都是同一个对象.
         */
        System.out.println("修改之后："+controllerA.getUser());
        System.out.println("controllerB："+controllerB.getUser());

        beanLifecycleComponent.destroy();


    }
}
