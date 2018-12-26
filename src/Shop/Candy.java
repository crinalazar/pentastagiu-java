package Shop;

public class Candy extends Products {

    int quantity;


    Candy (String name, double price){
        super (name, price);
        this.quantity = 200;

    }

    @Override
    public String toString() {
        return "Candy{" +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                "quantity=" + quantity +
                ", price=" + price +
                '}';
    }


}
