package javafxapplication.Proxy;

import javafxapplication.Model.CountSoldProduct;
import javafxapplication.Model.SoldProducts;

public class SoldProductsProxy extends Proxy {
    public SoldProducts[] getSoldProducts(String Name) {

        String Url=String.format("/soldproducts/%s", Name);
        return restTemplate.getForObject(urlService.GetServerUrl(Url), SoldProducts[].class);
    }
    public CountSoldProduct getCountSoldProducts(String name){

        String url = String.format("soldproducts/sum/%s", name);
        return restTemplate.getForObject(urlService.GetServerUrl(url), CountSoldProduct.class);
    }

}
