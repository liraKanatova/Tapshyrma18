import java.util.Arrays;

public class Flat extends Apartment{
    private Person []family;

    public Flat(String name, String address, int maxGuest, Person[] family) {
        super(name, address, maxGuest);
        this.family = family;
    }

    public Person[] getFamily() {
        return family;
    }

    public void setFamily(Person[] family) {
        this.family = family;
    }

    @Override
    public int live() {
        return getFamily().length;

    }

    @Override
    public void pay() {
        System.out.println("Pay for communal service");
    }



    @Override
    public String toString() {
        return "Flat{" +
                "family=" + Arrays.toString(family) +
                '}';
    }
}


