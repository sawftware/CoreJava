package Java__1_0.Polymorphism;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void makeSound(final int times) {
        for(int i = 0; i < times; i++) {
            makeSound();
        }
    }

}
