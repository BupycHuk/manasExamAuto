package javafxapplication.Proxy;

import javafxapplication.Model.Shop;

public class ShopProxy extends Proxy {

    public Shop[] getShops() {
        return restTemplate.getForObject(urlService.GetServerUrl("/shops/"), Shop[].class);
    }
}
