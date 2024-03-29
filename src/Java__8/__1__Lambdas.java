package Java__8;

import Java__8.Lambdas.Lambdas;
import Java__8.Lambdas.SquarableFunctionalInterface;

public class __1__Lambdas {
    public static void main(final String[] args) {
        final Lambdas lambdas = new Lambdas();
        lambdas.sortArray();

        final SquarableFunctionalInterface lambda = (i) -> i * i;
        System.out.println(lambda.toSquared(2));
    }
}
