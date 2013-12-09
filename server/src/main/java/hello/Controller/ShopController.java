package hello.Controller;

import hello.Config;
import hello.Model.*;
import hello.Model.RequestDto.AddShopRequest;
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
    Iterable<Shop> listShops() {

        return  getRepository().findAll();
    }

    @RequestMapping(value = "/addShop",method = RequestMethod.POST)
    public @ResponseBody
    Shop addShop(@RequestBody AddShopRequest addShopRequest) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Shop shop= new Shop(addShopRequest.getName(),addShopRequest.getContacts());
        getRepository().save(shop);
        return shop;
    }

    @RequestMapping(value = "/delete/shop/{id}")
    public @ResponseBody
    boolean deleteProduct(@PathVariable("id") long id) {

        getRepository().delete(id);
        return true;
    }

    public ShopRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(ShopRepository.class);
    }
}

