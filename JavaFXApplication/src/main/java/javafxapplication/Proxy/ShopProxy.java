package javafxapplication.Proxy;

import javafxapplication.Model.Shop;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 01.12.13
 * Time: 2:03
 * To change this template use File | Settings | File Templates.
 */
public class ShopProxy extends Proxy {

    public Shop[] getShops() {
        return restTemplate.getForObject(urlService.GetServerUrl("/shops/"), Shop[].class);
    }
}
