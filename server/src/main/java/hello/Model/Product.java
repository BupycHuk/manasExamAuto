package hello.Model;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(name="nameProduct")
    private String nameProduct;
    @Column(name="baaProdukt")
    private String baaProdukt;

    public Product() {}

    public Product(String nameProduct, String baaProdukt) {
        this.nameProduct = nameProduct;
        this.baaProdukt = baaProdukt;
    }
    public long getId() {
        return id;
    }
    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
    public String getBaaProdukt() {
        return baaProdukt;
    }

    public void setBaaProdukt(String baaProdukt) {
        this.baaProdukt = baaProdukt;
    }



    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product")
    private Product product;

    public Product getShop() {
        return product;
    }

    public void setShop(Product product) {
        this.product = product;
    }



}
