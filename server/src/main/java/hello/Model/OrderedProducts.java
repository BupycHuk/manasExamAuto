package hello.Model;

import javax.persistence.*;

@Entity
public class OrderedProducts {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(name="orderedProduct")
    private String orderedProduct;
    @Column(name="price")
    private String price;

    protected OrderedProducts() {}

    public OrderedProducts(String orderedProduct, String price) {
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "seller")

    private Seller seller;

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
