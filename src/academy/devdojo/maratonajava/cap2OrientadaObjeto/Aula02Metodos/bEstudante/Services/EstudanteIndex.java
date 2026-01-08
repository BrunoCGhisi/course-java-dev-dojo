package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Metodos.bEstudante.Services;


import academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Metodos.bEstudante.Model.Estudante;

public class EstudanteIndex {
    public static void main(String[] args) {
        Estudante estudanteMetodos = new Estudante();

        Estudante estudante01 = new Estudante();
        estudante01.nome = "Bruno";
        estudante01.idade = 18;
        estudante01.sexo = 'M';
        estudante01.matriculado = false;

        Estudante estudante02 = new Estudante();
        estudante02.nome = "Maria";
        estudante02.idade = 17;
        estudante02.sexo = 'F';
        estudante02.matriculado = true;

        estudanteMetodos.imprimeEstudante(estudante01);
        estudanteMetodos.isMatriculado(estudante01);

        estudanteMetodos.imprimeEstudante(estudante02);
        estudanteMetodos.isMatriculado(estudante02);

    }
}
