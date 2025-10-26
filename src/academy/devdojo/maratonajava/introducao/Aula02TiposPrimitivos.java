package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        byte numeroByte = 127;          // se passar de 127 da erro
        short numeroShort   = 22;       //Numnero com valor até 33k
        int age = 18;                   // Numero absurdamente alto
        long numeroLong = 2222;         // Mais alto ainda
        float numeroFloat = 2222.0F;    //Bota o F no final
        double numeroDouble = 2222;     //Numero com valor alto
        char letra = 'm';               // uma unica letra
        boolean verdadeiro = true;      //inicialmente Falso mas
        String frase = "Isso é uma grande frase";

        System.out.println("minha idade é " +age+" anos");
        System.out.println(frase);
    }
}
