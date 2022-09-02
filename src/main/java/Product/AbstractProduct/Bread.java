package Product.AbstractProduct;

public abstract class Bread extends Product {
    protected int cost;
    protected String expirationDate;

    protected Bread(int cost, String expirationDate) {
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
