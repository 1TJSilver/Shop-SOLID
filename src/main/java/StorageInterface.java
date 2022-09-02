import java.util.Map;

public interface StorageInterface {

    public static StorageInterface getInstance(){
        return null;
    }
    public int returnCost(String product);

    public boolean receiveProduct(String name);

    public int getCount(String name);

    public void restock();

}
