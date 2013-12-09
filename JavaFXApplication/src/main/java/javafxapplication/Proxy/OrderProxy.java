package javafxapplication.Proxy;

import javafxapplication.Model.Order;
import javafxapplication.Model.Product;
import javafxapplication.Model.RequestDto.AddOrderRequest;
/**
 * Created by Aza on 09.12.13.
 */
public class OrderProxy extends Proxy{

    public void productOrder(String orderedProduct){

        restTemplate.getForObject(urlService.GetServerUrl("/addOrder/"+orderedProduct), Order[].class);
    }

    public Order[] getOrders() {
        return restTemplate.getForObject(urlService.GetServerUrl("/orders/"), Order[].class);
    }
}
