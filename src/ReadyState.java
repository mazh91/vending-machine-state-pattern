public class ReadyState implements State {
    private VendingMachine vendingMachine;

    public ReadyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(double amt) {
        vendingMachine.addFunds(amt);
        System.out.println("Funds: " + vendingMachine.getFunds());
        vendingMachine.setState(vendingMachine.getCoinsInsertedState());
    }

    @Override
    public void inputItemCode(String code) {
        Product product = vendingMachine.getProductByKey(code);

        if( product != null) {
            double price = vendingMachine.getPrice(product);
            System.out.println(vendingMachine.getProduct().getDescription() + ": " + price);
        }
        else
            System.err.println("Error: could not retrieve product info");
    }

    @Override
    public void returnCoins() {
        System.out.println("No coins inserted");
    }

    @Override
    public void dispenseItem() {
        System.err.println("Operation not possible");
    }
}
