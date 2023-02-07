import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanH1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanH2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanC1 = (Cat) applicationContext.getBean("cat");
        Cat beanC2 = (Cat) applicationContext.getBean("cat");

        System.out.println((beanH1 == beanH2));
        System.out.println((beanC1 == beanC2));
    }
}