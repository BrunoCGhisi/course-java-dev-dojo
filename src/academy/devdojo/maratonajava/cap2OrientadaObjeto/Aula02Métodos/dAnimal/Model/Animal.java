package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Métodos.dAnimal.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Animal {
    private String especie;
    private int quantidade;
    private int capacidadeReprodutiva;
    private boolean isSexuado;
    private boolean extinto;

    public void exibirFicha()
    {
        System.out.println("FICHA DO "+ this.especie);
        System.out.println("Espécie: " + especie);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("CapacidadeReprodutiva: " + capacidadeReprodutiva);
        System.out.println("Tipo de Reprodução: " + (isSexuado ? "Sexuado" : "Assexuado"));
        System.out.println("Extinto: " + (extinto ? "Extinto" : "Na natureza"));
        divider();
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

    public void divider(){
        System.out.println("*******************************************");
    }

    public void getNewQuantidade(){
        System.out.println("Quantidade: " + quantidade);
        divider();

    }

    public void reproduzir(int especimesReproduzir){
        if (this.extinto){
            System.out.println("Não é possível se reproduzir, todos morreram. /: ");
            divider();
        }
        else{
            if (isSexuado){ //isSexuado True
                if (this.quantidade == 1){
                    System.out.println("Não é possível reproduzir com apenas 1 espécime");
                }
                else {
                    System.out.println(especimesReproduzir/2);
                    reproducaoSexuada(especimesReproduzir/2);
                }
            }
            else { //isSexuado False
                reproducaoAssexuada(especimesReproduzir);
            }
        }
    }

    private void reproducaoSexuada(int x){
        System.out.println("Espécie: " + this.especie +
                 "\nTotal de Acasalamento(s): " + x);
        this.quantidade = this.quantidade+(this.capacidadeReprodutiva*x);
        getNewQuantidade();

    }

    private void reproducaoAssexuada(int x){
        System.out.println("Espécie: " + this.especie +
                "\nTotal de Acasalamento(s): " + x +
                "\nCapacidade Reprodutiva Casal: " + this.capacidadeReprodutiva);
        this.quantidade = this.quantidade+(this.capacidadeReprodutiva*x);
        getNewQuantidade();

    }

    public void utilizarCobaias(int x){
        System.out.println("Você utilizou para experimentos: "+ x + " de "+ this.especie);
        this.quantidade = this.quantidade - x;
        getNewQuantidade();
    }

    public static void getVivos(List<Animal> animais){

        List<Animal> animaisVivos = animais.stream()
                .filter(animal -> !animal.extinto)
                .collect(Collectors.toList());
        System.out.println(animaisVivos);
    }




}

