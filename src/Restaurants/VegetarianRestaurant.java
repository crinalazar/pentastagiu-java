package Restaurants;

public class VegetarianRestaurant extends Restaurant {

    double payTax;

    public VegetarianRestaurant(int newGuests, int noOfGuests, double priceFixedMenu) {
        super(newGuests, noOfGuests, priceFixedMenu);
    }


    @Override
    public int getNoOfGuests() {
        return super.getNoOfGuests();
    }

    @Override
    public double getIncome() {
        return super.getIncome();
    }

    @Override
    public double payTaxes() {
        payTax = 0.2 * getIncome() - (0.2 * getIncome() *0.3);
        return payTax;
    }

    @Override
    public void getInfo() {
        System.out.println("Vegetarian Restaurant Info");
        System.out.println("Current number of guests is: " + getNoOfGuests());
        System.out.println("Current income is: " + getIncome() + "$");
        System.out.println("Taxes to pay: " + payTaxes());
    }
}

