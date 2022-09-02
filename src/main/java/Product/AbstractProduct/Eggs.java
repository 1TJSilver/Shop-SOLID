package Product.AbstractProduct;

public abstract class Eggs extends Product {
    protected static int count;
    protected int cost;
    protected String expirationDate;

    protected Eggs(int cost, String expirationDate) {
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
