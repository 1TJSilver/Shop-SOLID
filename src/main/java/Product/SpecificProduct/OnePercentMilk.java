package Product.SpecificProduct;

import Product.AbstractProduct.Milk;

public class OnePercentMilk extends Milk {
    private int cost;
    private String expirationDate;

    public OnePercentMilk(int cost, String expirationDate) {
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
