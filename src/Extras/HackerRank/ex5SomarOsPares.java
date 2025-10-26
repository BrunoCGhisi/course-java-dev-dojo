package Extras.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex5SomarOsPares {

    public static int somarPares(int x){
        String numero = String.valueOf(x);
        String[] numeros = numero.split("");
        List<Integer> lista = new ArrayList<>();


        return Arrays.stream(numeros)
                .map(inteiro -> Integer.valueOf(inteiro))
                .mapToInt(Integer -> Integer.intValue())
                .filter(par -> par % 2 == 0)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(somarPares(2002));
    }
}
