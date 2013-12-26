package javafxapplication.Model;

public class SoldProducts {

    private long id;
    private Integer count;
    private Double price;

    protected SoldProducts() {}

    public SoldProducts(Integer count, Double price) {
        this.count=count;
        this.price=price;

    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }
    private Seller seller;

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Seller getSeller() {
        return seller;
    }
    public String getFullName(){
        if (getSeller()!=null)
            return  getSeller().getFullName();
        return null;
    }

    private Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
    public String getProductName()
    {
        if (getProduct()!=null)
            return getProduct().getNameProduct();
        return null;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

