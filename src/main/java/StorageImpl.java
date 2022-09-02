import Product.AbstractProduct.*;
import Product.SpecificProduct.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StorageImpl implements StorageInterface {
    private static final int TYPES_OF_PRODUCT = 8;
    private static final int COUNT_OF_PRODUCT = 5;

    private static StorageImpl instance;

    private Map<String, List<Product>> products = new HashMap<>();

    private StorageImpl() {
        products.put("Baton", new ArrayList<>());
        products.put("BlackBread", new ArrayList<>());
        products.put("Beef", new ArrayList<>());
        products.put("Chicken", new ArrayList<>());
        products.put("OnePercentMilk", new ArrayList<>());
        products.put("TenPiecesEggs", new ArrayList<>());
        products.put("ThirtyPiecesEggs", new ArrayList<>());
        products.put("ThreePercentMilk", new ArrayList<>());

        restock();
    }

    public static StorageInterface getInstance() {
        return instance == null ? new StorageImpl() : instance;
    }

    @Override
    public int returnCost(String product) {
        return products.get(product).get(0).getCost();
    }

    public int getCount(String name) {
        int count = 0;
        for (Product product : products.get(name)) {
            if (product != null) {
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean receiveProduct(String name) {
        for (Product product : products.get(name)) {
            if (product != null) {
                products.get(name).remove(product);
                return true;
            }
        }
        return false;
    }

    @Override
    public void restock() {
        specificRestock("Baton");
        specificRestock("BlackBread");
        specificRestock("Chicken");
        specificRestock("Beef");
        specificRestock("OnePercentMilk");
        specificRestock("ThreePercentMilk");
        specificRestock("TenPiecesEggs");
        specificRestock("ThirtyPiecesEggs");
    }

    public void specificRestock(String product) {
        switch (product) {
            case "Baton":
                for (int j = 0; j < COUNT_OF_PRODUCT; j++) {
                    products.get("Baton").add(new Baton(25, "fifty days"));
                }
                break;
            case "BlackBread":
                for (int j = 0; j < COUNT_OF_PRODUCT; j++) {
                    products.get("BlackBread").add(new BlackBread(20, "fifty days"));
                }
                break;
            case "Chicken":
                for (int j = 0; j < COUNT_OF_PRODUCT; j++) {
                    products.get("Chicken").add(new Chicken(1, "six days"));
                }
                break;
            case "Beef":
                for (int j = 0; j < COUNT_OF_PRODUCT; j++) {
                    products.get("Beef").add(new Beef(1, "six days"));
                }
                break;
            case "OnePercentMilk":
                for (int j = 0; j < COUNT_OF_PRODUCT; j++) {
                    products.get("OnePercentMilk").add(new OnePercentMilk(50, "fifty days"));
                }
                break;
            case "ThreePercentMilk":
                for (int j = 0; j < COUNT_OF_PRODUCT; j++) {
                    products.get("ThreePercentMilk").add(new ThreePercentMilk(60, "fifty days"));
                }
                break;
            case "TenPiecesEggs":
                for (int j = 0; j < COUNT_OF_PRODUCT; j++) {
                    products.get("TenPiecesEggs").add(new TenPiecesEggs(60, "thirty days", "C-O"));
                }
                break;
            case "ThirtyPiecesEggs":
                for (int j = 0; j < COUNT_OF_PRODUCT; j++) {
                    products.get("ThirtyPiecesEggs").add(new ThirtyPiecesEggs(150, "thirty days", "C-1"));
                }
                break;
        }
    }
}
