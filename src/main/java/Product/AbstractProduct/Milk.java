package Product.AbstractProduct;

public abstract class Milk extends Product {
    protected int cost;
    protected String expirationDate;

    protected Milk(int cost, String expirationDate) {
        super(cost, expirationDate);
    }

    @Override
    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
