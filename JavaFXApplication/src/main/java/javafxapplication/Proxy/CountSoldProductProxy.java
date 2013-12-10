package javafxapplication.Proxy;

/**
 * Created by Imanali on 12/10/13.
 */
public class CountSoldProductProxy extends Proxy {
    public CountSoldProductProxy[] getCountSoldProducts(String name){

        String url = String.format("soldproducts/sum/%s/", name);
        return restTemplate.getForObject(urlService.GetServerUrl(url), CountSoldProductProxy[].class);
    }
}
