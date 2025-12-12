package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Métodos.dAnimal.Model;

public class Animal {
    private String especie;
    private int quantidade;
    private int capacidadeReprodutiva;
    private boolean isSexuado;
    private boolean extinto;

    public void imprime()
    {
        String auxExtinto = extinto ? "Extinto" : "Na natureza";
        String auxIsSexuado = isSexuado ? "Sexuado" : "Assexuado";

        System.out.println("Especie: " + especie);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("CapacidadeReprodutiva: " + capacidadeReprodutiva);
        System.out.println("Tipo de Reprodução: " + isSexuado ? "Sexuado" : "Assexuado");
        System.out.println("Extinto: " + auxExtinto);
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void setCapacidadeReprodutiva(int capacidadeReprodutiva) {
        this.capacidadeReprodutiva = capacidadeReprodutiva;
    }
    public void setExtinto(boolean extinto) {
        this.extinto = extinto;
    }


}

