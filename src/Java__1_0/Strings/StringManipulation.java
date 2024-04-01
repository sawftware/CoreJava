package Java__1_0.Strings;

public class StringManipulation {

    private final String helloWorld = "Hello, World!";

    public void sysout() {
        System.out.println(helloWorld);
    }

    public void trim() {
        final String helloWorldUntrimmed = "  Hello, World!  \n";
        System.out.println(helloWorldUntrimmed.trim());
    }

    public void concat() {
        final String hello = helloWorld.substring(0, 5);
        final String world = helloWorld.substring(7, 12);

        System.out.println(hello.concat(", ").concat(world).concat("!"));
    }

    public void replace() {
        System.out.println(helloWorld.replace("World", "Java"));
    }

    public void substring() {
        final String hello = helloWorld.substring(0, 5);
        final String world = helloWorld.substring(7, 12);

        System.out.println(hello + ", " + world + "!");
    }

}
