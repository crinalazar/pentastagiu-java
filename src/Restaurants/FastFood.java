package Restaurants;

public class FastFood extends Restaurant {

    double payTax;

    public FastFood(int newGuests, int noOfGuests, double priceFixedMenu) {
        super(newGuests ,noOfGuests, priceFixedMenu);
    }

    @Override
    public double getIncome() {
        return super.getIncome();
    }

    @Override
     public int getNoOfGuests() {
        return super.getNoOfGuests();
    }


    @Override
    public double payTaxes() {
        payTax = 0.2 * getIncome();
        return  payTax;
    }

    @Override
    public void getInfo() {
        System.out.println("\n" + "Fast Food Info");
        System.out.println("Current number of guests is:  " + getNoOfGuests());
        System.out.println("Current income is: " + getIncome() + "$" );
        System.out.println("Taxes to pay: " + payTaxes());
    }




}
