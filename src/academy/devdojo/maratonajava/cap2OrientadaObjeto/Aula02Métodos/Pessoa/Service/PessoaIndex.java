package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Métodos.Pessoa.Service;


import academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Métodos.Pessoa.Model.Pessoa;


public class PessoaIndex {
    public static void main(String[] args) {

        Pessoa pessoa01 = new Pessoa();
        pessoa01.setNome("Maria");
        pessoa01.setIdade(24);
        pessoa01.setSexo('F');

        Pessoa pessoa02 = new Pessoa();
        pessoa02.setNome("Pedro Venicio");
        pessoa02.setIdade(19);
        pessoa02.setSexo('M');

        pessoa01.imprime();
        System.out.println("***************************");
        pessoa02.imprime();

    }
}