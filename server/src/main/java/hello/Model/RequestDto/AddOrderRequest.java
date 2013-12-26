package hello.Model.RequestDto;

import java.io.Serializable;
/**
 * Created by Aza on 09.12.13.
 */
public class AddOrderRequest implements Serializable{

    private long sellerId;
    private String orderedProduct;
    private String price;


    public AddOrderRequest()
    {

    }

    public AddOrderRequest(long sellerId, String orderedProduct, String price) {
        //To change body of created methods use File | Settings | File Templates.
        this.sellerId = sellerId;
        this.orderedProduct = orderedProduct;
        this.price = price;
    }

    public String getOrderedProduct() {
        return orderedProduct;
    }

    public void setOrderedProduct(String orderedProduct) {
        this.orderedProduct = orderedProduct;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public long getSellerId() {
        return sellerId;
    }

    public void setSellerId(long sellerId) {
        this.sellerId = sellerId;
    }
}
