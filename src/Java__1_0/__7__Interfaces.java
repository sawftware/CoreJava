package Java__1_0;

import Java__1_0.Interfaces.Cat;
import Java__1_0.Interfaces.Dog;
import Java__1_0.Interfaces.IPrintable;

public class __7__Interfaces {

    public static void main(final String[] args) {
        final IPrintable IPrintableDog = new Dog();
        IPrintableDog.print();

        final IPrintable IPrintableCat = new Cat();
        IPrintableCat.print();

        final Dog dog = new Dog();
        dog.print();

        final Cat cat = new Cat();
        cat.print();
    }

}