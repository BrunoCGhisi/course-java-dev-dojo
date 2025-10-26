package Extras.ExerciciosJavaAlternativo;

import java.util.ArrayList;

public class Ex1ImprimiComecaLetra2 {
    public static void main(String[] args) {
        String[] nomes = {"Bruno", "Ana", "Beatriz", "Anna"};
        ArrayList<String> nomesComA = new ArrayList<>();
        for (String nome : nomes) {
            if (nome.startsWith("A")) {
                nomesComA.add(nome);
            }
        }
        System.out.println(nomesComA);
    }
}
