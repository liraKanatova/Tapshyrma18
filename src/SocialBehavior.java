import java.util.Arrays;

public class SocialBehavior extends Apartment{
    private Person[]people;

    public SocialBehavior(String name, String address, int maxGuest, Person[] people) {
        super(name, address, maxGuest);
        this.people = people;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public int live() {
        return getPeople().length;
    }

    @Override
    public void pay() {
        System.out.println("Pay for rent");

    }

    @Override
    public String toString() {
        return "SocialBehavior{" +
                "people=" + Arrays.toString(people) +
                '}';
    }
}
