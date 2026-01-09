package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02MetodosClasses.dAnimal.Model;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class Animal {
    protected String especie;
    protected int quantidade;
    protected int capacidadeReprodutiva;
    protected boolean extinto;

    public abstract void reproduzirSexuado(int x);

    public void exibirFicha()
    {
        System.out.println("FICHA DO "+ this.especie);
        System.out.println("Espécie: " + this.especie);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("CapacidadeReprodutiva: " + this.capacidadeReprodutiva);
        System.out.println("Lista Vermelha: " + (extinto ? "Extinto" : "Na natureza"));
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

    public static void divider(){
        System.out.println("*********************************************");
    }

    public void getNewQuantidade(){
        System.out.println("Quantidade: " + quantidade);
        divider();
    }

    public void utilizarCobaias(int x){
        System.out.println("Você utilizou para experimentos: "+ x + " de "+ this.especie);
        this.quantidade = this.quantidade - x;
        getNewQuantidade();
    }

    public static void getVivos(List<Animal> animais){
        System.out.println("ANIMAIS NÃO EXTINTOS: ");

        List<String> animaisVivos = animais.stream()
                .filter(animal -> !animal.extinto)
                .map(animal -> animal.especie)
                .collect(Collectors.toList());
        for(String animal: animaisVivos){
            System.out.println("Animal não Extinto: " + animal);
        }
        divider();
    }

    public static void getQuantidadeTotal(List<Animal> animais){
        System.out.println("TOTAL DE ANIMAIS: ");

        Map<String, Integer> animaisTotal = animais.stream()
                .collect(Collectors.toMap(
                        animal -> animal.especie,
                        animal -> animal.quantidade
                ));

        animaisTotal.forEach((animal, quantidade) ->{
            System.out.println(animal + ": " + quantidade);
        });

        divider();
    }

    public static void sumQuantidade(List<Animal> animais){
        System.out.println("MONTANTE TOTAL DE QUANTIDADE ANIMAIS: ");

        int montanteQuantidade = animais.stream()
                .mapToInt(animal -> animal.quantidade)
                .sum();

        System.out.println(montanteQuantidade + " animais em seu cativeiro");
        divider();
    }

}