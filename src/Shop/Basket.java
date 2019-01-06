package Shop;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    double totalPrice;
    Customer customer;
    double price;
    ArrayList<ItemsToBuy> items = new ArrayList<>();


    Basket(Customer customer) {
        double totalPrice;
        this.customer = customer;
    }

    public double getProductsPrice() {
        double itemPrice = 0;
                for (ItemsToBuy item : items){
            itemPrice = item.product.price * item.quantity;
        totalPrice += itemPrice;}
        return totalPrice;
    }

    public void addItems(ItemsToBuy item) {

        items.add( item);
           }

           public void showBasketList (){
        for (ItemsToBuy item : items) {
            System.out.println("ID: " + item.product.getId() + " Item name: " + item.product.name + " Price: "
                    + item.product.price + " quantity: " + item.quantity);
        }
           }


    @Override
    public String toString() {
        return "Basket{" +
                "totalPrice=" + totalPrice +
                ", customer=" + customer +
                '}';
    }
}
