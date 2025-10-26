package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ex4RemoverIguaisMantendoMsmOrdem {

    public static List<Integer> filtrar(Integer[] x){
        List<Integer> numeros = new ArrayList<>(Arrays.asList(x));
        List<Integer> filtrados = numeros.stream()
                .distinct()
                .collect(Collectors.toList());

        return filtrados;
    }
    public static void main(String[] args) {
        Integer[] inteiros = {5, 2, 3, 5, 2, 8, 9, 3};
        System.out.println(filtrar(inteiros));
    }
}
