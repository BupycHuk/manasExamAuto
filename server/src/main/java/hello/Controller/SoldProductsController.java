package hello.Controller;

import hello.Config;
import hello.Model.SoldProducts;
import hello.Model.SoldProductsRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Component
public class SoldProductsController {

    @RequestMapping(value = "/soldproducts/{Name}")
    public @ResponseBody
    Iterable<SoldProducts> listsoldProducts(@PathVariable("Name") String name) {   // бул жерде да id
        return  getRepository().findByName(name);
    }

    public SoldProductsRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(SoldProductsRepository.class);
    }
}
