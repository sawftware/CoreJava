package Java__1_0;

import Java__1_0.Polymorphism.Animal;
import Java__1_0.Polymorphism.Cat;
import Java__1_0.Polymorphism.Dog;

public class __5__Polymorphism {

    public static void main(final String[] args) {
        final Dog dog1 = new Dog();
        final Animal dog2 = new Dog();

        final Cat cat1 = new Cat();
        final Animal cat2 = new Cat();

        dog1.makeSound();
        dog2.makeSound(2);
        cat1.makeSound();
        cat2.makeSound(2);
    }

}