package HackerRank;

import java.util.Arrays;
import java.util.Comparator;

public class Ex6palavraComMaiorComprimento {
    public static String localizarMaiorPalavra(String x){
        String[] palavras = x.replaceAll("[^a-zA-Z]", " ").split(" ");

        String maiorPalavra = Arrays.stream(palavras)
                .max(Comparator.comparingInt(String :: length))
                .orElse("Está vazio a frase");



        return maiorPalavra;


        
    }

    public static void main(String[] args) {
        String frase = "Hoje eu caminhei para a floresta e encontrei um Antetegemon";
        System.out.println("A maior palavra de - " + frase + " - é: " + localizarMaiorPalavra(frase));

    }
}
