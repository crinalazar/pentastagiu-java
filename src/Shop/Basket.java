package Shop;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    double totalPrice;
    Customer customer;
    double price;
    ArrayList<Products> products = new ArrayList<>();


    Basket(Customer customer) {
        double totalPrice;
        this.customer = customer;
    }


    public double getProductsPrice() {
        for (Products product : products)
        totalPrice += product.price;
        return totalPrice;
    }

    public void addProduct(Products product) {
        products.add( product);
           }

           public void showBasketList (){
        for (Products product : products) {
            System.out.println("ID: " + product.getId() + " Item name: " + product.name + " Price: " + product.price);
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
