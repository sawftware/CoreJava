package Java__1_0.Encapsulation;

public class Dog {
    private static final String NOISE = "Woof!";
    private String name;
    public Dog() {
        setName("Rex");
    }
    public Dog(final String name) {
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
