import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hello1 =
                (HelloWorld) applicationContext.getBean("helloWorld");
        HelloWorld hello2 =
                applicationContext.getBean("helloWorld", HelloWorld.class);
        Cat cat1 = applicationContext.getBean("catBean", Cat.class);
        cat1.setName("Василий");
        Cat cat2 = applicationContext.getBean("catBean", Cat.class);
        cat2.setName("Тимофей");

        System.out.println(cat1==cat2);
        System.out.println(hello1.equals(hello2));
        System.out.println(cat1.getName());



    }
}