package academy.devdojo.maratonajava.cap1introducao;

public class Aula08LacoRepeticao {
    public static void main(String[] arg){
        int count = 0;
        while (count < 10){
            System.out.println(++count);
        } do {
            System.out.println("Entrou no do");
        } while (count < 10);
    }

}
