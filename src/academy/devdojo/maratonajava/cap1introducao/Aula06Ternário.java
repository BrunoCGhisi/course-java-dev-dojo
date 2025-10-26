package academy.devdojo.maratonajava.cap1introducao;

public class Aula06Ternário {
    public static void main(String[] args){
        double idade = 19;
        String isAllowedToJail = "Pode ser preso";
        String isNotAllowedToJail = "N Pode ser preso ): ";

        String resultado = idade >= 18 ? isAllowedToJail : isNotAllowedToJail;
        System.out.println(resultado);
    }
}
