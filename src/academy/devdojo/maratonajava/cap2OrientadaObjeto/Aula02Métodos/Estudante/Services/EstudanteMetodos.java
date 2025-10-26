package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Métodos.Estudante.Services;

import academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Métodos.Estudante.Model.Estudante;

public class EstudanteMetodos {
    public void imprimeEstudante(Estudante estudanteX){
        System.out.println("Nome: " + estudanteX.nome);
        System.out.println("Idade: " + estudanteX.idade);
        System.out.println("Sexo: " + estudanteX.sexo);
        System.out.println("***************************");
    }

    public void isMatriculado(Estudante estudanteX){
        System.out.println("Aluno: " + estudanteX.nome);
        System.out.println("Matriculado: " + (estudanteX.matriculado? "Sim" : "Não"));
        System.out.println("***************************");

    }
}
