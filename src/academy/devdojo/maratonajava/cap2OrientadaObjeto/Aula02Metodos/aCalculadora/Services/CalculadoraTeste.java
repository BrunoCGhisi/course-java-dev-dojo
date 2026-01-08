package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Metodos.aCalculadora.Services;

import academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Metodos.aCalculadora.Model.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somarDoisNumeros();               // Void sem parametro
        calculadora.subtrairDoisNumeros(10, 5); // Void com parametro
        double resultado = Calculadora.dividindoDoisValores(10, 2); //Static com parametros (return)
        System.out.println("Multiplicando: " + resultado);

        int[] numeros = new int[] {1, 2, 3, 4, 5};

        //VarArgs permite eu passar Array diretamente pelo parametro do método.
        calculadora.somarDoisNumerosVarArgs(numeros);
        calculadora.somarDoisNumerosVarArgs(1,2,3,4,5);




    }
}
