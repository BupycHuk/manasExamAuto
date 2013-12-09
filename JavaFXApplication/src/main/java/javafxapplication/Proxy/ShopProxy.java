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

    public boolean addShop(AddShopRequest shopAddRequest)
    {
        try {
            restTemplate.postForObject(urlService.GetServerUrl("/addShop/"), shopAddRequest, Shop.class);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;

    }
    public Shop[] getShops() {
        return restTemplate.getForObject(urlService.GetServerUrl("/shops/"), Shop[].class);
    }

    public void shopDelete(long id){

        restTemplate.getForObject(urlService.GetServerUrl("/delete/shop/"+id), Shop[].class);

    }
}
