package Java__1_0;

import Java__1_0.Inheritance.Dog;
import Java__1_0.Inheritance.Cat;

public class __6__Inheritance {
    public static void main(final String[] args) {
        final Dog dog = new Dog(false);
        final Cat cat = new Cat(true);

        if(dog.isSleepy()) {
            dog.sleep();
        }
        else {
            dog.play();
        }

        if(cat.isSleepy()) {
            cat.sleep();
        }
        else {
            cat.play();
        }
    }
}