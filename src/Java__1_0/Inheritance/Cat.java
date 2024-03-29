package Java__1_0.Inheritance;

public class Cat extends Animal {
    @Override
    public void play() {
        System.out.println("Playing with ball and string..");
        this.setIsSleepy(true);
    }
}
