package Restaurants;

public  abstract class Restaurant {

    private double income;
    private double priceFixedMenu;
    private int noOfGuests;
    private int newGuests;

    Restaurant( int newGuests, int noOfGuests, double priceFixedMenu) {
        this.newGuests = newGuests;
        this.noOfGuests = noOfGuests;
        this.priceFixedMenu = priceFixedMenu;
    }

    public int getNoOfGuests() {
       noOfGuests += newGuests;
        return noOfGuests;
    }

    public double getPriceFixedMenu() {
        return priceFixedMenu;
    }

    public double getIncome()
    {
        income = getPriceFixedMenu() * noOfGuests;
        return income;
    }

    public abstract void getInfo();

    public abstract double payTaxes ();



}
