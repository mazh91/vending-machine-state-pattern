
public class VendingMachine {

    private double funds;
    private String productCode;
    private Product product;
    private State state;
    private State readyState, codeInsertedState, coinsInsertedState,
            soldState, soldOutState;

    public VendingMachine(){
        this.state = new ReadyState(this);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getReadyState() {
        if(readyState == null)
            readyState = new ReadyState(this);
        return readyState;
    }

    public State getCodeInsertedState() {
        if(codeInsertedState == null)
            codeInsertedState = new CodeInsertedState(this);
        return codeInsertedState;
    }

    public State getCoinsInsertedState() {
        if(coinsInsertedState == null)
            coinsInsertedState = new CoinsInsertedState(this);
        return coinsInsertedState;
    }

    public State getSoldState() {
        if(soldState == null)
            soldState = new SoldState(this);
        return soldState;
    }

    public State getSoldOutState() {
        if(soldOutState == null)
            soldOutState = new SoldOutState(this);
        return soldOutState;
    }

    public void setFunds(double amt){
        funds += amt;
    }
    public double getFunds() {
        return funds;
    }

    public void setProductCode(String code){
        productCode = code;
    }
    public String getProductCode(){
        return  productCode;
    }

    public double getPrice(String key){
        //Double price = product.getPrice();
        if(product != null)
            return product.getPrice();
        return -1;
    }
}
