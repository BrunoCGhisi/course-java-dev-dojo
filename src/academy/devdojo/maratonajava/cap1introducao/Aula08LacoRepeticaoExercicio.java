package academy.devdojo.maratonajava.cap1introducao;

public class Aula08LacoRepeticaoExercicio {
    public static void main(String[] args){
        byte numero = 100;
        byte contador = 0;
        for (byte x=0; x<=numero; x++ ) {
            if (contador == 25){
                break;
            }
            if (x % 2 == 0){
                System.out.println(x);
                ++contador;
            }
        }
    System.out.println(contador);
    }
}
