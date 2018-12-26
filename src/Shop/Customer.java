package Shop;
import java.util.UUID;

enum MEMBERSHIP {
    GOLD, SILVER, NONE
}

public class Customer {

    long id = UUID.randomUUID().getMostSignificantBits();
    String name;
    private MEMBERSHIP membership;


    public MEMBERSHIP getMembership() {
        return membership;
    }

    public void setMembership(MEMBERSHIP membership) {
        this.membership = membership;

    }

    Customer(String name, MEMBERSHIP membership) {
        long id;
        this.name = name;
        this.membership = membership;
    }

    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", membership=" + membership +
                '}';

           }
    public double getMembershipDiscount(double finalPrice) {
        if (membership == MEMBERSHIP.GOLD) {
            finalPrice = finalPrice - finalPrice * 20 / 100;}
        else
            if (membership == MEMBERSHIP.SILVER) {
                finalPrice = finalPrice - finalPrice * 10 / 100;
            }
        return finalPrice;

        }


    }


