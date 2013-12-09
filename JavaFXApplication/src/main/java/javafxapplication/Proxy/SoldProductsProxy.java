package javafxapplication.Proxy;

import javafxapplication.Model.SoldProducts;

public class SoldProductsProxy extends Proxy {

    public SoldProducts[] getSoldProducts(String name) {
        String Url=String.format("/soldproducts/{%s}", name);
        return restTemplate.getForObject(urlService.GetServerUrl(Url), SoldProducts[].class);
    }

}
