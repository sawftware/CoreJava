package Java__1_0;

import Java__1_0.Randoms.Randoms;

public class __10__Randoms {

    public static void main(final String[] args) {

        final Randoms randoms = new Randoms();

        int randomInteger = randoms.getRandomInteger();
        System.out.printf("Random integer value: %d\n", randomInteger);
        randomInteger = randoms.getRandomInteger(10);
        System.out.printf("New random integer value between 0 and 10: %d\n", randomInteger);
        randomInteger = randoms.getRandomInteger(10, 20);
        System.out.printf("New random integer value between 10 and 20: %d\n", randomInteger);

        double randomDouble = randoms.getRandomDouble();
        System.out.printf("Random double value: %.2f\n", randomDouble);
        randomDouble = randoms.getRandomDouble(10);
        System.out.printf("New random double value between 0 and 10: %.2f\n", randomDouble);
        randomDouble = randoms.getRandomDouble(10, 20);
        System.out.printf("New random double value between 10 and 20: %.2f\n", randomDouble);

        float randomFloat = randoms.getRandomFloat();
        System.out.printf("Random float value: %.3f\n", randomFloat);
        randomFloat = randoms.getRandomFloat(10f);
        System.out.printf("New random float value between 0 and 10: %.3f\n", randomFloat);
        randomFloat = randoms.getRandomFloat(10f, 20f);
        System.out.printf("New random float value between 10 and 20: %.3f\n", randomFloat);

        long randomLong = randoms.getRandomLong();
        System.out.printf("Random long value: %d\n", randomLong);
        randomLong = randoms.getRandomLong(10L);
        System.out.printf("New random long value between 0 and 10: %d\n", randomLong);
        randomLong = randoms.getRandomLong(10L, 20L);
        System.out.printf("New random long value between 10 and 20: %d\n", randomLong);

        final boolean randomBoolean = randoms.getRandomBoolean();
        System.out.printf("Random boolean value: %b\n", randomBoolean);

    }

}