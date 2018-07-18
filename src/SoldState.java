public class SoldState implements State {

    private VendingMachine vendingMachine;

    public SoldState(VendingMachine vendingMachine){
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
        int count = vendingMachine.getProduct().getCount();
        vendingMachine.getProduct().setCount( count-1 );
        vendingMachine.reduceFunds( vendingMachine.getProduct().getPrice() );

        System.out.println("Dispensing..");
        System.out.flush();

        if(vendingMachine.getFunds() > 0.0)
            vendingMachine.setState(vendingMachine.getCoinsInsertedState());
        else
            vendingMachine.setState(vendingMachine.getReadyState());
    }
}
