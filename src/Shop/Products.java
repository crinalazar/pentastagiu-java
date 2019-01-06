package Shop;


public class Products {
    String id = getId();
    String name;
    double price;


    Products (String name, double price){
        this.id = getId();
        this.name = name;
        this.price = price;
    }
    Products (String name){
        this.id = getId();
        this.name = name;
    }


    public String getId () {
        String id = "";
        double d;
        for (int i = 1; i <= 6; i++) {
            d = Math.random() * 10;
            id = id + ((int) d);
        }
        return id;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}










