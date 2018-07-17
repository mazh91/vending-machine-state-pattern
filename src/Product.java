public class Product {

    String description;
    double price;
    int count;

    public Product(String description, double price, int count){
        this.description = description;
        this.price = price;
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
