package Product.SpecificProduct;

import Product.AbstractProduct.Eggs;

public class ThirtyPiecesEggs extends Eggs {
    private int cost;
    private String expirationDate;
    public static final int COUNT = 30;
    private String grade;

    public ThirtyPiecesEggs(int cost, String expirationDate, String grade) {
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

    public String getGrade() {
        return grade;
    }
}
