package javafxapplication.Proxy;

import javafxapplication.Model.RequestDto.AddShopRequest;
import javafxapplication.Model.Shop;

public class ShopProxy extends Proxy {


    public void deleteShops(long id)

    {
        restTemplate.getForObject(urlService.GetServerUrl("/shops/delete/"+id), Shop[].class);
        //return restTemplate.getForObject(urlService.GetServerUrl("/shops/delete/{id}"), Shop[].class);
    }


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
}
