package Extras.ExerciciosJavaAlternativo;

import java.util.Arrays;
import java.util.List;

public class Ex3Streams {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(2,3,4,5,6,7,8,9,2,5,2,3,4,2,4,2,4);

        numeros.stream()
                .filter(numero -> numero%2 == 0)
                .map(par -> par*2)
                .sorted()
                .forEach(numero -> System.out.println(numero));

    }
}
