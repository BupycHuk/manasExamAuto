package javafxapplication.Proxy;

import javafxapplication.Model.SoldProducts;

public class SoldProductsProxy extends Proxy {
    public SoldProducts[] getSoldProducts(String Name) {

        String Url=String.format("/soldproducts/%s", Name);
        return restTemplate.getForObject(urlService.GetServerUrl(Url), SoldProducts[].class);
    }

}
