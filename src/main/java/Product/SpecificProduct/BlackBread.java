package Product.SpecificProduct;

import Product.AbstractProduct.Bread;

public class BlackBread extends Bread {
    private int cost;
    private String expirationDate;

    public BlackBread(int cost, String expirationDate) {
        super(cost, expirationDate);
        this.cost = cost;
        this.expirationDate = expirationDate;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getExpirationDate() {
        return expirationDate;
    }
}
