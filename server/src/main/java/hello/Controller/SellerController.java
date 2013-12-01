package hello.Controller;

import hello.Config;
import hello.Model.*;
import hello.Model.RequestDto.AddSellerRequest;
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
public class SellerController {

    @RequestMapping(value = "/sellers")
    public @ResponseBody
    Iterable<Seller> listSellers() {

        return  getRepository().findAll();
    }

    @RequestMapping(value = "/addSeller",method = RequestMethod.POST)
    public @ResponseBody
    Seller addSeller(@RequestBody AddSellerRequest addSellerRequest) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ShopRepository shopRepository = context.getBean(ShopRepository.class);
        Shop shop = shopRepository.findOne(addSellerRequest.getShopId());

        Seller seller= new Seller(addSellerRequest.getSellername(),addSellerRequest.getLogin(),addSellerRequest.getPassword());
        seller.setShop(shop);
        getRepository().save(seller);
        return seller;
    }
    @RequestMapping(value = "/delete/{name}")
    public @ResponseBody
    boolean deleteUser(@PathVariable("name") String name) {
        Iterable<Seller> seller = getRepository().findByFullName(name);
        getRepository().delete(seller);
         return true;
    }

    public SellerRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(SellerRepository.class);
    }
}

