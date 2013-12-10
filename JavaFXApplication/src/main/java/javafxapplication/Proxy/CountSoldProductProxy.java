package javafxapplication.Proxy;

import javafxapplication.Model.CountSoldProduct;

public class CountSoldProductProxy extends Proxy {
    public CountSoldProduct getCountSoldProducts(String name){

        String url = String.format("soldproducts/sum/%s", name);
        return restTemplate.getForObject(urlService.GetServerUrl(url), CountSoldProduct.class);
    }
}
