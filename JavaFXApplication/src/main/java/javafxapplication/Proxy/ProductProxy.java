package javafxapplication.Proxy;


import javafxapplication.Model.Product;
import javafxapplication.Model.RequestDto.AddProductRequest;

/**
 * Created by Aza on 08.12.13.
 */
public class ProductProxy extends Proxy{

    public boolean addProduct(AddProductRequest productAddRequest)
    {
        try {
            restTemplate.postForObject(urlService.GetServerUrl("/addProduct/"), productAddRequest, Product.class);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;

    }

    public Product[] getProducts() {
        return restTemplate.getForObject(urlService.GetServerUrl("/products/"), Product[].class);
    }

    public void productDelete(long id){

        restTemplate.getForObject(urlService.GetServerUrl("/delete/product/"+id), Product[].class);
    }
}
