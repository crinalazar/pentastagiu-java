package Shop;


public class MainClass {
    public static void main(String[] args) {
        ItemsToBuy items;


        Customer cust1 = new Customer("Mihai Marin", MEMBERSHIP.GOLD );


        //Products available:
        Book b1 = new Book ("Wuthering Heights", 30, "Emily Brontë");
        Book b2 = new Book ("Rebecca", 25, "Daphne du Maurier");
        Book b3 = new Book ("Memoirs of a Geisha", 25, "Arthur Golden");
        Candy c1 = new Candy ("Strawberry Candy", 10);
        Candy c2 = new Candy ("Mint Candy", 10);

        ItemsToBuy item1 = new ItemsToBuy( b1,2 );
        ItemsToBuy item2 = new ItemsToBuy( c1,5 );
        ItemsToBuy item3 = new ItemsToBuy( b2,3);



        Basket basket1 = new Basket(cust1);
        //Products in basket:
        basket1.addItems( item1);
        basket1.addItems( item2);
        basket1.addItems( item3 );

       basket1.showBasketList();
       double totalPrice = basket1.getProductsPrice();
       basket1.customer.getMembershipDiscount( totalPrice );
       System.out.println("Final price with discount is: " + basket1.customer.getMembershipDiscount( totalPrice ) );


    }


    }


















