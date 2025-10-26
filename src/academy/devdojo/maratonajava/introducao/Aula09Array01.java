package academy.devdojo.maratonajava.introducao;

public class Aula09Array01 {
    public static void main(String[] args){
        int[] idades = new int[3];
        idades[0] = 15;
        idades[1] = 18;
        idades[2] = 21;
        for(int x = 0;  x < idades.length; x++)
            System.out.println(idades[x]);
    }
}
