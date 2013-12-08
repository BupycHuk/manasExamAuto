package hello.Controller;

import hello.Config;
import hello.Model.*;
import hello.Model.Repository.ShopRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 27.10.13
 * Time: 13:03
 * To change this template use File | Settings | File Templates.
 */

@Component
@Controller
public class ShopController {

    @RequestMapping(value = "/shops")
    public @ResponseBody
    Iterable<Shop> listSellers() {

        return  getRepository().findAll();
    }

    public ShopRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(ShopRepository.class);
    }
}

