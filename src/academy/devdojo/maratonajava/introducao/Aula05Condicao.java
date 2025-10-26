package academy.devdojo.maratonajava.introducao;

public class Aula05Condicao {
    public static void main(String[] args){

        int idade = 21;
        String categoria;
        if (idade < 15){
            categoria = "Juvenil";

        } else if (idade >= 15 && idade < 18) {
            categoria = "Jovem";
        } else {
            categoria = "Adulto";
        }
        System.out.println("Sua categoria é: " + categoria);
    }
}
