package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Métodos.Estudante.Services;


import academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Métodos.Estudante.Model.Estudante;

public class EstudanteIndex {
    public static void main(String[] args) {
        EstudanteMetodos metodo = new EstudanteMetodos();

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

        metodo.imprimeEstudante(estudante01);
        metodo.isMatriculado(estudante01);

        metodo.imprimeEstudante(estudante02);
        metodo.isMatriculado(estudante02);


    }
}
