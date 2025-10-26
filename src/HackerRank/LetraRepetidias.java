package HackerRank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LetraRepetidias {

    public static HashMap<String, Integer> filtrar(String x){
        List<String> letras = new ArrayList<>(List.of(x.toLowerCase().replaceAll("[^a-z]", "").split("")));
        HashMap<String, Integer> contagem = new HashMap<>();
        letras.forEach(letra -> contagem.put(letra, contagem.getOrDefault(letra, 0) + 1));

         return contagem;

    }

    public static void main(String[] args) {
        System.out.println(filtrar("Eu adoro tomar sorvete, adoro adoro"));
    }
}
