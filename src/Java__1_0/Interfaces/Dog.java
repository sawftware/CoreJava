package Java__1_0.Interfaces;

public class Dog implements IPrintable {

    public Dog() {}

    @Override
    public void print() {
        System.out.println("Woof *dog noises* Woof!");
    }

}
