package javafxapplication.Model;

/**
 * Created by Aza on 08.12.13.
 */
public class Products {

    private long id;
    private String nameProduct;
    private double price;

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public long getId() {
        return id;
    }

    public String toString()
    {
        return getId()+" - "+ getNameProduct();

    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
