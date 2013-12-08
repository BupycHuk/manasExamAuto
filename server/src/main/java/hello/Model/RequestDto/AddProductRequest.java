package hello.Model.RequestDto;

import java.io.Serializable;
/**
 * Created by Aza on 08.12.13.
 */
public class AddProductRequest implements Serializable{

    private long shopId;
    private String nameProduct;
    private Double price;


    public AddProductRequest()
    {

    }

    public AddProductRequest(long shopId, String nameProduct, Double price) {
        //To change body of created methods use File | Settings | File Templates.
        this.shopId = shopId;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public long getShopId() {
        return shopId;
    }

    public void setShopId(long shopId)
    {
        this.shopId =shopId;
    }


    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
