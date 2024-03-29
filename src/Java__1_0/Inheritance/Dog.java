package Java__1_0.Inheritance;

public class Dog extends Animal {
    @Override
    public void play() {
        System.out.println("Playing with bone toy..");
        this.setIsSleepy(true);
    }
}
