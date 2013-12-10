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


    public void deleteShops(long id)

    {
        restTemplate.getForObject(urlService.GetServerUrl("/shops/delete/"+id), Shop[].class);
        //return restTemplate.getForObject(urlService.GetServerUrl("/shops/delete/{id}"), Shop[].class);
    }


    public Shop[] getShops() {
        return restTemplate.getForObject(urlService.GetServerUrl("/shops/"), Shop[].class);
    }
}
