package Java__1_0.Polymorphism;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void makeSound(int times) {
        for(int i = 0; i < times; i++) {
            makeSound();
        }
    }

}
