package javafxapplication.Model;

public class Product{
    private long id;

    private String nameProduct;

    private Double price;


    public long getId() {
        return id;
    }

    public String getName() {
        return nameProduct;
    }

    public void setName(String name) {
        this.nameProduct = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
