package Java__1_0.Strings;

public class StringFormatting {

    public void stringFormat() {
        final String name = "Alan";
        final int age = 32;

        final String formattedString = String.format("Hello, %s! You are %d years old!", name, age);

        System.out.println(formattedString);
    }

}
