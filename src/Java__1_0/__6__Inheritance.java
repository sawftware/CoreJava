package Java__1_0;

import Java__1_0.Inheritance.Dog;
import Java__1_0.Inheritance.Cat;

public class __6__Inheritance {
    public static void main(String[] args) {
        final Dog dog = new Dog();
        dog.setIsSleepy(true);

        final Cat cat = new Cat();
        cat.setIsSleepy(false);

        if(!dog.isSleepy()) {
            dog.play();
        }

        if(!cat.isSleepy()) {
            cat.play();
        }
    }
}