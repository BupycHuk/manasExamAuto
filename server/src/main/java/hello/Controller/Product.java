package hello.Controller;

import hello.Config;
import hello.Model.ProductsRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Component
public class Product {
    @RequestMapping(value = "/products/")
    public @ResponseBody
    Iterable<hello.Model.Product> listProducts(){
        return getRepository().findAll();

    }
    public ProductsRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(ProductsRepository.class);
    }
}
