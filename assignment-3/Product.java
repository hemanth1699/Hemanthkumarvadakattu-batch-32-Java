public class Product {
  // variable pice
    double price;

    public double getPrice() {
        return price;
    }

    public double getPrice( double quantity) {
        return price*quantity;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}