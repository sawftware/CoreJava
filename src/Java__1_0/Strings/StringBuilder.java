package Java__1_0.Strings;

public class StringBuilder {

    public void stringBuilder() {
        final String name = "Alan";
        final int age = 32;

        final java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
        stringBuilder.append("Hello, ").append(name).append("! You are ").append(age).append(" years old!");

        System.out.println(stringBuilder);
    }

}
