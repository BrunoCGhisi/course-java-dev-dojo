package academy.devdojo.maratonajava.cap1introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        String separador = "***********************************************************";

        // Operadores aritméticos
        int soma = 1 + 1;
        int subtracao = 1 - 1;
        int divisao = 2 / 2;
        int multi = 2 * 2;
        int resto = 2 % 2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Multiplicação: " + multi);
        System.out.println("Resto da divisão: " + resto);

        // Observação: a divisão entre dois ints sempre resulta em int.
        // Para resultado quebrado, use pelo menos um double.

        // Operadores relacionais
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;

        System.out.println(separador);
        System.out.println("10 > 20? " + isDezMaiorQueVinte);
        System.out.println("10 < 20? " + isDezMenorQueVinte);
        System.out.println("10 == 20? " + isDezIgualAVinte);
        System.out.println("10 != 20? " + isDezDiferenteDeVinte);

        // Comparadores &&  ||

        boolean isDezMaiorQueVinteIgualVinte = 10 > 20 && 10 == 20;
        boolean isDezMaiorQueVinteIgualDez = 10 > 20 && 10 == 10;
        boolean isDezMaiorQueVinteOuCincoMaiorQueUm = 10 > 20 || 5 > 1;
        boolean isDezMaiorQueVinteOuCincoMenorQueUm = 10 > 20 || 5 < 1;

        System.out.println(separador);
        System.out.println("10 > 20 e 10 == 20 " + isDezMaiorQueVinteIgualVinte);
        System.out.println("10 < 20? e 10 == 10 " + isDezMaiorQueVinteIgualDez);
        System.out.println("10 == 20 ou 5 > 1 + " + isDezMaiorQueVinteOuCincoMaiorQueUm);
        System.out.println("10 == 20 ou 5 < 1 " + isDezMaiorQueVinteOuCincoMenorQueUm);

        // Atribuições +=  -=  /=
        System.out.println(separador);
        double somaDinamica = 1000;
        somaDinamica += 1000;
        System.out.println("1000 += 1000 " + somaDinamica);

        double subtracaoDinamica = 1000;
        subtracaoDinamica -= 1000;
        System.out.println("1000 -= 1000 " + subtracaoDinamica);

        double divisaoDinamica = 1000;
        divisaoDinamica /= 1000;
        System.out.println("1000 /= 1000 " + divisaoDinamica);

        // Contaderes ++ -- (antes e depois)

        int contador1 = 0;
        contador1 +=1;
        contador1++;
        contador1--;
        ++contador1;
        --contador1;

        System.out.println("Printa primeiro e depos vai somar" + contador1++); //Printa primeiro o contador depois soma
        System.out.println("Soma Primeiro e depois Soma" + ++contador1); //Soma o contador depois printa






    }
}
