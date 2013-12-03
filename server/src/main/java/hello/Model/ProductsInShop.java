package hello.Model;

import javax.persistence.*;

@Entity
public class ProductsInShop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="shop")
    private String shop;
    @Column(name="count")
    private Integer count;

    protected ProductsInShop() {}

    public ProductsInShop(String shop, Integer count) {
        this.shop = shop;
        this.count=count;
    }

    public long getId() {
        return id;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getShop() {
        return shop;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "providerName")
    private Provider provider;

    public Provider getName(){
        return provider;
    }

    public void setName(Provider name){
        this.provider=name;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product")
    private Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

}

