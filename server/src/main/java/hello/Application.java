package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {

// of course, an ApplicationContext is just a BeanFactory
//        BeanFactory factory = (BeanFactory) appContext;
//        repository = (SellerRepository) factory.getBean("customerRepository");

        SpringApplication.run(Application.class, args);
    }
}
