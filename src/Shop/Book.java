package Shop;


public class Book extends Products {

    String author;



    Book ( String name, double price, String author){
        super (name,price);
        this.author = author;
    }



    public String toString() {
        return "Book{" +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                "author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

