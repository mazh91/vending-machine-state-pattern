public class SoldOutState implements State {

    private VendingMachine vendingMachine;

    public SoldOutState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(double amt) {
        System.err.println("Operation not possible");
    }

    @Override
    public void inputItemCode(String code) {
        System.err.println("Operation not possible");
    }

    @Override
    public void returnCoins() {
        System.err.println("Operation not possible");
    }

    @Override
    public void dispenseItem() {
        System.err.println("Item sold out!");
        vendingMachine.setState(vendingMachine.getCoinsInsertedState());
    }
}
