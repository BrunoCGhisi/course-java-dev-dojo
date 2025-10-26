package ExerciciosJavaAlternativo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class impares {
    public static void main(String[] args) {
        int l = 2;
        int r = 5;

        List<Integer> numeros = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (i % 2 != 0){
                numeros.add(i);
            }
        }
        System.out.println(numeros);
    }
}
