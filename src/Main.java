public class Main {
    public static void main(String[] args) {
    Person person1=new Person("Asan",25,"@-Asan");
    Person person2=new Person("Uson",24,"@-Uson");
    Person person3=new Person("Asin",23,"@-Asin");
    Person person4=new Person("Asi",22,"@-Asi");
    Person person5=new Person("Aran",21,"@-Aran");
    Person person6=new Person("Isan",20,"@-Isan");
    Person person7=new Person("Isa",26,"@-Isa");
    Person[]guest={person1,person2};
    Person[]family={person3,person4};
    Person[] people={person5,person6,person7};

    Apartment hotel=new Hotel("Eva","Kievskai 23",80,guest);
        System.out.println("Hotel");
        hotel.pay();
        System.out.println(hotel.live());
        Apartment flat= new Flat("Elit","Sovetskay",12,family);
        System.out.println("Flat");
        flat.pay();
        System.out.println(flat.live());
        Apartment socialBehavior=new SocialBehavior("Hostinnyi dom","Moskovskai",25,people);
        System.out.println("SocialBehavior");
        socialBehavior.pay();
        System.out.println(socialBehavior.live());
    }
}