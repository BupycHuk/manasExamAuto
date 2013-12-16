package javafxapplication.Proxy;

import javafxapplication.Model.Shop;

public class ShopProxy extends Proxy {


    public void deleteShops(long id)

    {
        restTemplate.getForObject(urlService.GetServerUrl("/shops/delete/"+id), Shop[].class);
        //return restTemplate.getForObject(urlService.GetServerUrl("/shops/delete/{id}"), Shop[].class);
    }


    public Shop[] getShops() {
        return restTemplate.getForObject(urlService.GetServerUrl("/shops/"), Shop[].class);
    }
}
