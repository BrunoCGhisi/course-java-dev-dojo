package Extras.ExerciciosJavaAlternativo;

import java.util.Arrays;
import java.util.HashSet;

public class Ex2RemoverNumeroRepetido {
    public static void main(String[] args) {
        Integer[] numeros =  {1, 2, 2, 3, 4, 4, 5};
        HashSet<Integer> numerosNaoRepetidos = new HashSet<>(Arrays.asList(numeros));
        System.out.println(numerosNaoRepetidos);
    }
}
