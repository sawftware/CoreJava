package Java__1_0;

import Java__1_0.AbstractClasses.Animal;
import Java__1_0.AbstractClasses.Cat;
import Java__1_0.AbstractClasses.Dog;
import java.util.Vector;

public class __4__AbstractClasses {
    public static void main(final String[] args) {
        final Dog dog1 = new Dog();
        final Animal dog2 = new Dog();

        final Cat cat1 = new Cat();
        final Animal cat2 = new Cat();

        final Vector<Animal> animals = new Vector<>();
        animals.add(dog1);
        animals.add(dog2);
        animals.add(cat1);
        animals.add(cat2);

        for (int index = 0; index < animals.size(); index++){
            final Animal animal = animals.get(index);
            if(animal instanceof Dog) {
                System.out.println("Animal is Dog");
            }
            else if(animal instanceof Cat) {
                System.out.println("Animal is Cat");
            }
        }
    }
}