package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Métodos.Calculadora.Model;

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
}
