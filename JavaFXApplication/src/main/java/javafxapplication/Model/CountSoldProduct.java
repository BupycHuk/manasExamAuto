package javafxapplication.Model;

public class CountSoldProduct {

    private long countProduct = 0;
    private Double sumProduct = 0.0;

    public CountSoldProduct(){}

    public CountSoldProduct(long countProduct, Double sumProduct)
    {
        this.countProduct = countProduct;
        this.sumProduct = sumProduct;
    }


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
