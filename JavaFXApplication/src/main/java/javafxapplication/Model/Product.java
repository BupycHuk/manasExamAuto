package javafxapplication.Model;

/**
 * Created by Aza on 08.12.13.
 */
public class Product {

    private long id;
    private String nameProduct;
    private String baasy;

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct, String baasy) {
        this.nameProduct = nameProduct;
        this.baasy = baasy;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String toString()
    {
        return getId()+" - "+ getNameProduct();

    }


    public String getBaasy() {
        return baasy;
    }

    public void setBaasy(String baasy) {
        this.baasy = baasy;
    }

    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getProductTuru()
    {
        if (getProduct()!=null)
            return getProduct().getProductTuru();
        return null;
    }


}
