package Java__1_0.Randoms;

import java.util.Random;

public class Randoms {

    final private Random random = new Random();

    public int getRandomInteger() {
        return random.nextInt();
    }

    public int getRandomInteger(final int upperBound) {
        return random.nextInt(upperBound);
    }

    public int getRandomInteger(final int lowerBound, final int upperBound) {
        return random.nextInt(lowerBound, upperBound);
    }

    public double getRandomDouble() {
        return random.nextDouble();
    }

    public double getRandomDouble(final double upperBound) {
        return random.nextDouble(upperBound);
    }

    public double getRandomDouble(final double lowerBound, final double upperBound) {
        return random.nextDouble(lowerBound, upperBound);
    }

    public float getRandomFloat() {
        return random.nextFloat();
    }

    public float getRandomFloat(final float upperBound) {
        return random.nextFloat(upperBound);
    }

    public float getRandomFloat(final float lowerBound, final float upperBound) {
        return random.nextFloat(lowerBound, upperBound);
    }

    public long getRandomLong() {
        return random.nextLong();
    }

    public long getRandomLong(final long upperBound) {
        return random.nextLong(upperBound);
    }

    public long getRandomLong(final long lowerBound, final long upperBound) {
        return random.nextLong(lowerBound, upperBound);
    }

    public boolean getRandomBoolean() {
        return random.nextBoolean();
    }

}
