package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula01Introducao.service;

import academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula01Introducao.Model.Pessoa;

public class pessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoaUm = new Pessoa();
        pessoaUm.nome = "Bruno";
        pessoaUm.idade = 18;
        pessoaUm.sexo = 'm';
        System.out.println("Nome: " + pessoaUm.nome + " - Idade: " + pessoaUm.idade + " - Sexo:  " + pessoaUm.sexo);

        Pessoa pessoaDois = new Pessoa();
        pessoaDois = pessoaUm;
        System.out.println("Nome: " + pessoaDois.nome + " - Idade: " + pessoaDois.idade + " - Sexo:  " + pessoaDois.sexo);


    }
}