package Extras.ExerciciosJavaAlternativo;
import java.util.ArrayList;
/**
 * aaaaaaaaaaaaaaaaaaaaaaaaa
 * aaaaaaaa
 */

public class Ex1ImprimiComecaLetra {
    public static void main(String[] args) {
        String[] nomes = {"Bruno", "Ana", "Beatriz", "Anna"};
        ArrayList<String> nomesComA = new ArrayList<>();

        for (String nome : nomes){
            if (nome.toLowerCase().charAt(0) == 'a'){
                nomesComA.add(nome);
            }
        }
        System.out.println("Nomes com A: "+ nomesComA);
    }
}
