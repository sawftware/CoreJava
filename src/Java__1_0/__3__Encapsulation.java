package Java__1_0;

import Java__1_0.Encapsulation.Cat;
import Java__1_0.Encapsulation.Dog;

public class __3__Encapsulation {
    public static void main(final String[] args) {
        final Dog dog1 = new Dog();
        final Dog dog2 = new Dog("Hugo");
        final Cat cat1 = new Cat();
        final Cat cat2 = new Cat("Fluffy");

        System.out.println("Dog1 is called: " + dog1.getName());
        System.out.println("Dog2 is called: " + dog2.getName());
        System.out.println("Cat1 is called: " + cat1.getName());
        System.out.println("Cat2 is called: " + cat2.getName());

        System.out.println("Dog1 makes the sound: " + dog1.getNoise());
        System.out.println("Cat1 makes the sound: " + cat1.getNoise());
    }
}