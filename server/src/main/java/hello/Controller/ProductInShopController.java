package hello.Controller;

import hello.Config;
import hello.Model.ProductsInShop;
import hello.Model.Repository.ProductsInShopRepository;
import hello.Model.Repository.ShopRepository;
import hello.Model.ResponseDto.ProductInShopCount;
import hello.Model.Shop;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 27.10.13
 * Time: 13:03
 * To change this template use File | Settings | File Templates.
 */

@Component
@Controller
public class ProductInShopController {

    @RequestMapping(value = "/productinshop/groupbyshop")
    public @ResponseBody
    Iterable<ProductInShopCount> groupByShop() {

        return  getRepository().groupByShop();
    }

    public ProductsInShopRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(ProductsInShopRepository.class);
    }
}

