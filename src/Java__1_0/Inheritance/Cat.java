package Java__1_0.Inheritance;

public class Cat extends Animal {

    public Cat(final boolean isSleepy) {
        super.setIsSleepy(isSleepy);
    }

    @Override
    public void play() {
        System.out.println("Playing with ball and string..");
        super.setIsSleepy(true);
    }

}
