package OrientadaObjeto.Aula02Métodos.Services;

import OrientadaObjeto.Aula02Métodos.Model.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculo = new Calculadora();
        calculo.somarDoisNumeros();               // Void sem parametro
        calculo.subtrairDoisNumeros(10, 5); // Void com parametro
        double resultado = calculo.dividindoDoisValores(10, 2); //Static com parametros (return)
        System.out.println("Multiplicando: " + resultado);


    }
}
