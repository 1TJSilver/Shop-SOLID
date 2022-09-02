package Product.SpecificProduct;

import Product.AbstractProduct.Meat;

public class Beef extends Meat {
    public static final int COST_PER_KILO = 140;
    private final int weight; //In kilogram
    private final int cost;

    public Beef(int weight, String expirationDate) {
        super(COST_PER_KILO * weight, expirationDate);
        this.weight = weight;
        this.cost = COST_PER_KILO * weight;
        this.expirationDate = expirationDate;
    }

    @Override
    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public int getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }

}
