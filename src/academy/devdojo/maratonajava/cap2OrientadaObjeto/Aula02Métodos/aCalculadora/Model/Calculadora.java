package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Métodos.aCalculadora.Model;

public class Calculadora {
    public void somarDoisNumeros(){

        System.out.println("Somando: "+ (10 + 10));
    }

    public void subtrairDoisNumeros(int x, int y){
        System.out.println("Subtraindo: "+(x-y) );
    }

    public static int dividindoDoisValores(int x, int y){
        if (y == 0){
            return 0;
        }
        return x/2;
    }

    public void somarDoisNumerosVarArgs(int... x){
        int soma = 0;
        for (int i : x){
            soma += i;
        }
        System.out.println("Somando: "+ x + "Soma: " +soma);
    }
}
