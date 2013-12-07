package javafxapplication.Proxy;

import hello.Controller.Product;

/**
 * Created by Imanali on 12/7/13.
 */
public class ProductProxy extends Proxy{
    public Product[] getProduct(){
        return restTemplate.getForObject(urlService.GetServerUrl("/products/"), Product[].class);
    }
}
