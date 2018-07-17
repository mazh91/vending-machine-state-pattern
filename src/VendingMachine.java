import java.util.Map;

public class VendingMachine {
    double funds;
    String productCode;
    Map<String, Integer> productPrice;

    State state = new ReadyState(this);
    //state = new CoinsInsertedState();

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

    public int getPrice(String key){
        Integer price = productPrice.get(key);
        if(price != null)
            return price;
        return -1;
    }
}
