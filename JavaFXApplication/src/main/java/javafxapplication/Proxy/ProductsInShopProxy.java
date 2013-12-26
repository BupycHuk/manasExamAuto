package javafxapplication.Proxy;

import javafxapplication.Model.ProductsInShop;
import javafxapplication.Model.ResponseDto.ProductInShopCount;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Akim
 * Date: 08.12.13
 * Time: 22:59
 * To change this template use File | Settings | File Templates.
 */
public class ProductsInShopProxy extends Proxy {

    public ProductInShopCount[] getProductsInShopCountByShop() {
        return restTemplate.getForObject(urlService.GetServerUrl("/productinshop/groupbyshop"),ProductInShopCount[].class);
    }
}
