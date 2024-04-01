package Java__8.DefaultMethods;

import Java__8.DefaultMethods.IPrintable;

public class Dog implements IPrintable {

    @Override
    public void print() {
        System.out.println("Woof *dog noises* Woof!");
    }

}