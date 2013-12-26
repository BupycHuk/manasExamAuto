package hello.Model.ResponseDto;

/**
 * Created by Admin on 16.12.13.
 */
public class ProductInShopCount {

    private long shopId;
    private long count;
    public ProductInShopCount()
    {}

    public ProductInShopCount(long shopId,long count)
    {

        this.shopId = shopId;
        this.count = count;
    }

    public long getShopId() {
        return shopId;
    }

    public void setShopId(long shopId) {
        this.shopId = shopId;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
