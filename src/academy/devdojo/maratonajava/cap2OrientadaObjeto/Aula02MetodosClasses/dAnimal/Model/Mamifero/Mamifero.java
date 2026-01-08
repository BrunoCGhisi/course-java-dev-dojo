package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02MetodosClasses.dAnimal.Model.Mamifero;

import academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02MetodosClasses.dAnimal.Model.Animal;

public class Mamifero extends Animal {

    private int femeasRepouso;
    private int dispostosAcasalamento;

    @Override
    public void reproduzir(int especimesReproduzir){
        if (this.extinto || this.quantidade < 2 || especimesReproduzir < 2){
            System.out.println("O animal não tem população suficiente ): ");
        }
        else{
            especimesReproduzir = especimesReproduzir / 2;
            this.femeasRepouso = especimesReproduzir;
            this.quantidade = this.quantidade+(especimesReproduzir*this.capacidadeReprodutiva);
            System.out.println("Nova população: " + this.quantidade);
            System.out.println("Mães em Descanso: " + this.femeasRepouso);
        }
    }
}