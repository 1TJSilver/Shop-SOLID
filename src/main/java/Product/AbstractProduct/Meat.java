package Product.AbstractProduct;

public abstract class Meat extends Product {
    public static int costPerKilo;
    protected int cost;
    protected String expirationDate;

    protected Meat(int cost, String expirationDate) {
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
