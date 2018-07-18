import java.util.Map;

public class VendingMachine {

    private double funds;
    private String productCode;
    private Product product;
    private State state;
    private State readyState, coinsInsertedState,
            soldState, soldOutState;
    private Map<String, Product> productMap;

    public VendingMachine(Map<String, Product> productMap){
        if(state == null)
            state = getReadyState();
        this.productMap = productMap;
    }

    public Product getProduct() {
        return product;
    }

    public Product getProductByKey(String key) {
        product = productMap.get(key);
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

    public void addFunds(double amt){
        funds += amt;
    }
    public void reduceFunds(double amt){
        funds -= amt;
    }
    public void resetFunds(){
        funds = 0.0;
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

    public double getPrice(Product product){
        return product.getPrice();
    }

    // Operator methods
    public void insertCoin(double amt) {
        getState().insertCoin(amt);
    }

    public void inputItemCode(String code) {
        getState().inputItemCode(code);
    }

    public void returnCoins() {
        getState().returnCoins();
    }

    public void dispenseItem() {
        getState().dispenseItem();
    }
}
