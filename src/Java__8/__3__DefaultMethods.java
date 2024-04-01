package Java__8;

import Java__8.DefaultMethods.Cat;
import Java__8.DefaultMethods.Dog;
import Java__8.DefaultMethods.IPrintable;

public class __3__DefaultMethods {

    public static void main(final String[] args) {
        final IPrintable IPrintableDog = new Dog();
        IPrintableDog.print();
        IPrintableDog.printDefaultMethodImplementation();

        final IPrintable IPrintableCat = new Cat();
        IPrintableCat.print();
        IPrintableCat.printDefaultMethodImplementation();
    }

}
