import java.util.HashMap;
import java.util.Map;

public class VendingMachineRunner {

    public static void main(String[] args) {

        Map<String, Product> productMap = new HashMap<>();

        productMap.put( "A1", new Product("KitKat medium bar", 2.75, 5) );
        productMap.put( "A2",  new Product("Twix medium bar", 2.50, 5) );
        productMap.put( "B1", new Product( "Pringles jalapeno mini", 3.25, 3) );
        productMap.put( "B2", new Product( "Doritos original", 2.25, 1) );


        VendingMachine vendingMachine = new VendingMachine(productMap);

        vendingMachine.inputItemCode("B2");

        vendingMachine.insertCoin(2.75);
        vendingMachine.insertCoin(0.50);

        vendingMachine.inputItemCode("B2");

        vendingMachine.dispenseItem();

        vendingMachine.inputItemCode("B2");
        vendingMachine.insertCoin(1.25);
        vendingMachine.inputItemCode("B2");

        vendingMachine.insertCoin(0.25);
        vendingMachine.inputItemCode("A2");

        vendingMachine.insertCoin(0.25);
        vendingMachine.returnCoins();
    }
}
