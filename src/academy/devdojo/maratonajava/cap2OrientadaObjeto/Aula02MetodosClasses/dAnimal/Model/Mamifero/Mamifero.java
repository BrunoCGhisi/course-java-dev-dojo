package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02MetodosClasses.dAnimal.Model.Mamifero;

import academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02MetodosClasses.dAnimal.Model.Animal;

public class Mamifero extends Animal {

    private int emDescanso = 0;

    @Override
    public void reproduzirSexuado(int especimesReproduzir){
        int disponivelAcasalar = this.quantidade - especimesReproduzir;

        if (!this.extinto && this.quantidade > 1 && especimesReproduzir > 1 && disponivelAcasalar < especimesReproduzir){
            int casais = especimesReproduzir / 2;
            this.emDescanso = casais;

            this.quantidade = this.quantidade+(casais*this.capacidadeReprodutiva);
            System.out.println("Cada casal ("+ casais +") de " + this.especie + " reproduziu "+ this.capacidadeReprodutiva);
            System.out.println("Nova população: " + this.quantidade);
            System.out.println("Mães em Descanso: " + this.emDescanso);
            divider();

        }
        else{
            System.out.println("O animal não tem população suficiente :/ ");
        }
    }


}