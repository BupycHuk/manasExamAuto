package javafxapplication.Model;

/**
 * Created by Aza on 09.12.13.
 */
public class OrderedProducts {

    private long id;
    private String orderedProduct;
    private String price;

    public String getOrderedProduct() {
        return orderedProduct;
    }

    protected OrderedProducts() {}

    public OrderedProducts(String orderedProduct, String price) {
        this.orderedProduct = orderedProduct;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String toString()
    {
        return getId()+" - "+ getOrderedProduct();

    }


    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    private Seller seller;

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getSellername()
    {
        if (getSeller()!=null)
            return getSeller().getFullName();
        return null;
    }
}
