package Product.AbstractProduct;

public abstract class Product {
    protected int cost;
    protected String expirationDate;

    protected Product(int cost, String expirationDate) {
        this.cost = cost;
        this.expirationDate = expirationDate;
    }

    public int getCost() {
        return cost;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
}
