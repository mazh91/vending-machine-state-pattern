public class CoinsInsertedState implements State {
    private VendingMachine vendingMachine;

    public CoinsInsertedState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin(double amt) {
        vendingMachine.addFunds(amt);
        System.out.println("Funds: " + vendingMachine.getFunds());
    }

    @Override
    public void inputItemCode(String code) {
        double price = vendingMachine.getPrice(code);
        double funds = vendingMachine.getFunds();

        if( funds >= price ){
            int count = vendingMachine.getProduct().getCount();
            if(count == 0)
                vendingMachine.setState(vendingMachine.getSoldOutState());
            else
                vendingMachine.setState(vendingMachine.getSoldState());
            vendingMachine.dispenseItem();
        } else {
            double diff = price - funds;
            System.out.printf("Need %.2f more\n", diff);
        }

    }

    @Override
    public void returnCoins() {
        vendingMachine.resetFunds();
        System.out.println("Returning coins..");
        vendingMachine.setState( vendingMachine.getReadyState() );
    }

    @Override
    public void dispenseItem() {
        System.err.println("Operation not possible");
    }
}
