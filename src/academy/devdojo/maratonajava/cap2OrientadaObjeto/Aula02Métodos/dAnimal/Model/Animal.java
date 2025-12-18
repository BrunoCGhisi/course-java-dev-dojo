package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Métodos.dAnimal.Model;

public class Animal {
    private String especie;
    private int quantidade;
    private int capacidadeReprodutiva;
    private boolean isSexuado;
    private boolean extinto;

    public void exiberFicha()
    {
        System.out.println("Espécie: " + especie);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("CapacidadeReprodutiva: " + capacidadeReprodutiva);
        System.out.println("Tipo de Reprodução: " + (isSexuado ? "Sexuado" : "Assexuado"));
        System.out.println("Extinto: " + (extinto ? "Extinto" : "Na natureza"));
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        this.extinto = quantidade <= 0;
    }

    public void setCapacidadeReprodutiva(int capacidadeReprodutiva) {
        this.capacidadeReprodutiva = capacidadeReprodutiva;
    }

    public void setIsSexuado(String isSexuado) {
        isSexuado = isSexuado.toLowerCase();
        this.isSexuado = isSexuado.equals("sim");
    }



}

