package Java__1_1.InnerClasses;

public class InnerClasses {

    private static final String HELLO_WORLD_OUTER = "Hello, World! From outer class";

    public InnerClasses() {
        System.out.println(HELLO_WORLD_OUTER);
        final InnerClass innerClass = new InnerClass();
    }

    private static class InnerClass {
        private static final String HELLO_WORLD_INNER = "Hello, World! From inner class";

        private InnerClass() {
            System.out.println(HELLO_WORLD_INNER);
            System.out.println(HELLO_WORLD_OUTER);
        }
    }

}
