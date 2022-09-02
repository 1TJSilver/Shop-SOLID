import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StorageInterface storage = StorageImpl.getInstance();
        int result = 0, choice = 0;
        SellerInterface seller = new Seller(storage);
        String price;
        System.out.println("Welcome to shop");
        one:
        while (choice != -1) {
            price = "  Name " + "\t" + "       Cost " + "\t" + " Count\n"
                    + "1.Baton      " + "\t  " + storage.returnCost("Baton") + " \t    " + storage.getCount("Baton")
                    + "\n2.Black Bread" + "     " + storage.returnCost("BlackBread") + "        " + storage.getCount("BlackBread")
                    + "\n3.Beef" + "\t\t\t " + storage.returnCost("Beef") + "\t\t" + storage.getCount("Beef")
                    + "\n4.Chicken" + "\t     " + storage.returnCost("Chicken") + "\t\t" + storage.getCount("Chicken")
                    + "\n5.Milk 1%" + "\t     " + storage.returnCost("OnePercentMilk") + "\t\t\t" + storage.getCount("OnePercentMilk")
                    + "\n6.Milk 3%" + "\t     " + storage.returnCost("ThreePercentMilk") + "\t\t\t" + storage.getCount("ThreePercentMilk")
                    + "\n7.Eggs 30" + "\t     " + storage.returnCost("ThirtyPiecesEggs") + "\t\t" + storage.getCount("ThirtyPiecesEggs")
                    + "\n8.Eggs 10" + "\t     " + storage.returnCost("TenPiecesEggs") + "\t\t\t" + storage.getCount("TenPiecesEggs")
                    + "\n9.Calculate the amount"
                    + "\n0.Refresh";
            System.out.println(price);
            System.out.print("-->");
            choice = scanner.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    seller.receiveProduct("Baton");
                    result += storage.returnCost("Baton");
                    break;
                case 2:
                    seller.receiveProduct("BlackBread");
                    result += storage.returnCost("BlackBread");
                    break;
                case 3:
                    seller.receiveProduct("Beef");
                    result += storage.returnCost("Beef");
                    break;
                case 4:
                    seller.receiveProduct("Chicken");
                    result += storage.returnCost("Chicken");
                    break;
                case 5:
                    seller.receiveProduct("OnePercentMilk");
                    result += storage.returnCost("OnePercentMilk");
                    break;
                case 6:
                    seller.receiveProduct("ThreePercentMilk");
                    result += storage.returnCost("ThreePercentMilk");
                    break;
                case 7:
                    seller.receiveProduct("ThirtyPiecesEggs");
                    result += storage.returnCost("ThirtyPiecesEggs");
                    break;
                case 8:
                    seller.receiveProduct("TenPiecesEggs");
                    result += storage.returnCost("TenPiecesEggs");
                    break;
                case 9:
                    System.out.println("Total amount: " + result + "\n");
                    break one;
                case 0:
                    storage.restock();
                    break;
            }
        }
    }
}
