package hello.Model;

import javax.persistence.*;

@Entity
public class SoldProducts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;
    @Column(name="count")
    private int count;
    @Column(name="price")
    private Double price;

    protected SoldProducts() {}

    public SoldProducts(Integer count, Double price) {
        this.count=count;
        this.price=price;

    }

    public long getId() {
        return id;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "seller")
    private Seller seller;

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Seller getSeller() {
        return seller;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "productName")
    private Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}

