package hello.Controller;

import hello.Config;
import hello.Model.*;
import hello.Model.RequestDto.AddProductRequest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Aza on 08.12.13.
 */
@Component
@Controller
public class ProductController {

    @RequestMapping(value = "/products")
    public @ResponseBody
    Iterable<Product> listProducts() {

        return  getRepository().findAll();
    }

    @RequestMapping(value = "/addProduct",method = RequestMethod.POST)
    public @ResponseBody
    Product addProduct(@RequestBody AddProductRequest addProductRequest) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        ShopRepository shopRepository = context.getBean(ShopRepository.class);
        Shop shop = shopRepository.findOne(addProductRequest.getShopId());
        Product product= new Product(addProductRequest.getNameProduct(),addProductRequest.getPrice());
        product.setShop(shop);
        getRepository().save(product);
        return product;
    }

    @RequestMapping(value = "/delete/product/{id}")
    public @ResponseBody
    boolean deleteProduct(@PathVariable("id") long id) {

        getRepository().delete(id);
        return true;
    }

    public ProductRepository getRepository() {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(ProductRepository.class);
    }
}
