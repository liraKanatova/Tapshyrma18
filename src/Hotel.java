import java.util.Arrays;

public class Hotel extends Apartment {

    private Person[] guest;

    public Hotel(String name, String address, int maxGuest, Person[] guest) {
        super(name, address, maxGuest);
        this.guest = guest;
    }

    public Person[] getGuest() {
        return guest;
    }

    public void setGuest(Person[] guest) {
        this.guest = guest;
    }

    @Override
    public int live() {
        return getGuest().length;
    }

    @Override
    public void pay() {
        System.out.println("Pay for rent");


    }

    @Override
    public String toString() {
        return "Hotel{" +
                "guest=" + Arrays.toString(guest) +
                '}';
    }
}
