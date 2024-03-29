package Java__1_0.Strings;

public class StringFormatting {

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

    public void stringFormat() {
        final String name = "Alan";
        final int age = 32;

        final String formattedString = String.format("Hello, %s! You are %d years old!", name, age);

        System.out.println(formattedString);
    }

    public void stringBuilder() {
        final String name = "Alan";
        final int age = 32;

        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello, ").append(name).append("! You are ").append(age).append(" years old!");

        System.out.println(stringBuilder);
    }
}
