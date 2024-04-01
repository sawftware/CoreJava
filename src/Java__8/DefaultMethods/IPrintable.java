package Java__8.DefaultMethods;

public interface IPrintable {
    void print();

    default void printDefaultMethodImplementation() {
        System.out.println("Default method implementation");
    }
}
