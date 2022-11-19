import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanHW =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHW.getMessage());

        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(AppConfig.class);
        Cat beanCat =
                (Cat) applicationContext2.getBean("cat");
        System.out.println(beanCat.getMessage());

        Cat beanCat1 =
                (Cat) applicationContext2.getBean("cat");
        System.out.println(beanCat1.getMessage());

        System.out.println(bean == beanHW);
        System.out.println(beanCat == beanCat1);
    }
}