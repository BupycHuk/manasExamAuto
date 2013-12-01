package javafxapplication.Proxy;

import javafxapplication.Model.RequestDto.AddSellerRequest;
import javafxapplication.Model.Seller;

/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 01.12.13
 * Time: 2:03
 * To change this template use File | Settings | File Templates.
 */
public class SellerProxy extends Proxy {

    public boolean addSeller(AddSellerRequest sellerAddRequest)
    {
        try {
            restTemplate.postForObject(urlService.GetServerUrl("/addSeller/"), sellerAddRequest, Seller.class);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;

    }

    public Seller[] getSellers() {
        return restTemplate.getForObject(urlService.GetServerUrl("/sellers/"), Seller[].class);
    }
}
