import java.util.Map;

public interface State {
    void insertCoin(double amt);
    void inputItemCode(String code);
    void returnCoins();
    void dispenseItem();
}
