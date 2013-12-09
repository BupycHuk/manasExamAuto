package javafxapplication.Proxy;

import javafxapplication.Model.RequestDto.AddShopRequest;
import javafxapplication.Model.Shop;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 01.12.13
 * Time: 2:03
 * To change this template use File | Settings | File Templates.
 */
public class ShopProxy extends Proxy {

    public boolean addShop(AddShopRequest addShopRequest)
    {
        try
        {
            restTemplate.postForObject(urlService.GetServerUrl("/addShop/"), addShopRequest, Shop.class);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;

    }
    public void deleteShops(long id)

    {
        restTemplate.getForObject(urlService.GetServerUrl("/shops/delete/"+id), Shop[].class);
        //return restTemplate.getForObject(urlService.GetServerUrl("/shops/delete/{id}"), Shop[].class);
    }


    public Shop[] getShops() {
        return restTemplate.getForObject(urlService.GetServerUrl("/shops/"), Shop[].class);
    }
}
