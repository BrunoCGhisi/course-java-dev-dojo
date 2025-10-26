package Extras.HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parenteses {
    public static String isParenteses(String x){
        List<String> parenteses = new ArrayList<>(Arrays.asList(x.split("")));
        String resultado = "Sim";
        if (parenteses.size()%2 != 0){
            resultado = "Não";
        }
        else {
            for (int i = 0; i < parenteses.size()/2; i++) {
                String comparadorInicial = parenteses.get(i);
                int indiceCompradorFinal = (parenteses.size() - 1 - i);
                String compradorFinal = parenteses.get(indiceCompradorFinal);

                System.out.println("Comparando: " + comparadorInicial + " - " + compradorFinal);
                System.out.println("Indice: " + i + " - " + indiceCompradorFinal);

                switch (comparadorInicial) {
                    case "(":
                        if (!compradorFinal.equals(")")) {
                            resultado = "Não é igual";
                        }
                        break;

                    case "{":
                        if (!compradorFinal.equals("}")) {
                            resultado = "Não é igual";
                        }
                        break;

                    case "[":
                        if (!compradorFinal.equals("]")) {
                            resultado = "Não é igual";
                        }
                        break;
                }
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(isParenteses("{[()]}")); // ❌ Ainda dá errado (precisaria de pilha)

    }
}
