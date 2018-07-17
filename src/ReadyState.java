public class ReadyState implements State {
    VendingMachine vendingMachine;

    public ReadyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(double amt) {
        vendingMachine.setFunds(amt);
    }

    @Override
    public void inputItemCode(String code) {
        String productCode = vendingMachine.getProductCode();
        int price = vendingMachine.getPrice(code);

        if( productCode != null || price != -1 )
            System.out.println(  );
        else
            System.err.println("Error: could not retrieve product info");
    }

    @Override
    public void returnCoins() {
        System.out.println("No coins inserted");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Abort: no coins inserted");
    }
}
