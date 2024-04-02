package Java__16;

import Java__16.Records.Cat;
import Java__16.Records.Dog;

public class __2__Records {
    public static void main(final String[] args) {
        final Dog dog = new Dog("Rex");
        System.out.println(dog.name());

        final Cat cat = new Cat("Whiskers", 10);
        System.out.println(cat.name());
        System.out.println(cat.age());
    }
}
