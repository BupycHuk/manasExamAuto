package javafxapplication.Proxy;

import javafxapplication.Model.OrderedProducts;
import javafxapplication.Model.RequestDto.AddOrderRequest;
import org.springframework.core.annotation.Order;

/**
 * Created by Aza on 09.12.13.
 */
public class OrderProxy extends Proxy{

//    public void productOrder(String orderedProduct){
//
//        restTemplate.getForObject(urlService.GetServerUrl("/addOrder/"+orderedProduct), OrderedProduct[].class);
//    }

    public boolean addOrderedProduct(AddOrderRequest orderAddRequest)
    {
        try {
            restTemplate.postForObject(urlService.GetServerUrl("/addOrder/"), orderAddRequest, OrderedProducts.class);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;

    }

    public OrderedProducts[] getOrders() {
        return restTemplate.getForObject(urlService.GetServerUrl("/orders/"), OrderedProducts[].class);
    }
}
