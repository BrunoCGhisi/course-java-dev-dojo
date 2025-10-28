package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Métodos.Pessoa.Service;


import academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Métodos.Pessoa.Model.Pessoa;


public class PessoaIndex {
    public static void main(String[] args) {

        Pessoa pessoa01 = new Pessoa();
        pessoa01.setNome("Maria");
        pessoa01.setIdade(19);

        pessoa01.imprime();

    }
}