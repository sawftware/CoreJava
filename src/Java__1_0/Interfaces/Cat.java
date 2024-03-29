package Java__1_0.Interfaces;

public class Cat implements IPrintable {

    public Cat() { }

    @Override
    public void print() {
        System.out.println("Meow *cat noises* Meow!");
    }

}
