package academy.devdojo.maratonajava.introducao;

public class Aula09ArrayForEach {
    public static void main(String[] args) {
        int[] lista = new int[]{1,2,3,4,5};
        int count = 0;
        /* Opção 1 For
         for(i=0; i > lista.lenght; i++) {
            System.out.println(lista[i]);
         }
         */
        // Opção 2 for each
        for(int num:lista){
            System.out.println(num);
            count = num == 2 ? count + 1 : count;
        }
        System.out.println(count);
    }
}

