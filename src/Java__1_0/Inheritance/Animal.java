package Java__1_0.Inheritance;

public abstract class Animal {

    protected boolean isSleepy = false;

    protected abstract void play();

    public void sleep() {
        System.out.println("Zzzz...");
        setIsSleepy(false);
    }

    public void setIsSleepy(final boolean isSleepy) {
        this.isSleepy = isSleepy;
    }

    public boolean isSleepy() {
        return this.isSleepy;
    }
}
