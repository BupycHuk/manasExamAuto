package hello.Model;

public class CountSoldProduct  {

    public CountSoldProduct(){}

    public CountSoldProduct(long countProduct, Double sumProduct )
    {
        this.countProduct = countProduct;
        this.sumProduct = sumProduct;
    }
    private long countProduct = 0;
    private Double sumProduct = 0.0;

    public long getCountProduct() {
        return countProduct;
    }

    public void setCountProduct(long countProduct) {
        this.countProduct = countProduct;
    }

    public Double getSumProduct() {
        return sumProduct;
    }

    public void setSumProduct(Double sumProduct) {
        this.sumProduct = sumProduct;
    }
}
