package Java__1_0.Encapsulation;

public class Cat {
    private static final String NOISE = "Meow!";
    private String name;
    public Cat() {
        setName("Whiskers");
    }
    public Cat(final String name) {
        setName(name);
    }
    public void setName(final String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public String getNoise() { return NOISE; }
}
