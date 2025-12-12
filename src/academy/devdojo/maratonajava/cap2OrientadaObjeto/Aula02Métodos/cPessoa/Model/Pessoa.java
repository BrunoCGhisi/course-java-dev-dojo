package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Métodos.cPessoa.Model;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade < 18) {
            this.idade = 0;
        }
        this.idade = idade;
    }

    public void setSexo(char sexo) { this.sexo = sexo; }
}
