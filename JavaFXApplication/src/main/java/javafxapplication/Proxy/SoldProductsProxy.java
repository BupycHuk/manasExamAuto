package javafxapplication.Proxy;

import javafxapplication.Model.SoldProducts;

public class SoldProductsProxy extends Proxy {

        public SoldProducts[] getSoldProducts() {
            return restTemplate.getForObject(urlService.GetServerUrl("/soldproducts/"), SoldProducts[].class);
        }
}
