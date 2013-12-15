package javafxapplication.Model;

public class ProductsInShop {
    private long id;
    private Integer count;

    protected ProductsInShop() {}

    public ProductsInShop(Shop shop, Integer count) {
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

    private Shop shop;

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Shop getShop() {
        return shop;
    }

    private Provider provider;

    public Provider getName(){
        return provider;
    }

    public void setName(Provider provider){
        this.provider=provider;
    }

    private Product product;

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }


}

