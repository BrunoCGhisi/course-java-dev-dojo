package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02MetodosClasses.bEstudante.Model;

public class Estudante {
    public String nome;
    public Integer idade;
    public Character sexo;
    public Boolean matriculado;

    public void imprimeEstudante(Estudante estudante){
        System.out.println("******* Verificando variáveis dos Estudantes *******");
        System.out.println("Nome: "+estudante.nome);
        System.out.println("idade: "+estudante.idade);
        System.out.println("Sexo: "+estudante.sexo);
        System.out.println("Matriculado: "+estudante.matriculado);

    }

    public void isMatriculado(Estudante estudante){
        System.out.println("******* Verificando status de Matricula *******");
        String statusMatricula = estudante.matriculado ? "Matriculado" : "Não matriculado";
        System.out.println(estudante.nome + " Status: " + statusMatricula);
    }

}






