public class Seller implements SellerInterface {
    public StorageInterface storage;

    public Seller(StorageInterface storage) {
        this.storage = storage;
    }

    @Override
    public boolean receiveProduct(String name) {
        return storage.receiveProduct(name);
    }

    @Override
    public StorageInterface getStorage() {
        return storage;
    }
}
