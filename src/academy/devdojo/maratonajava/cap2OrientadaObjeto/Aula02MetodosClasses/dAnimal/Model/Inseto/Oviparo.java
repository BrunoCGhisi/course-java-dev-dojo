package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02MetodosClasses.dAnimal.Model.Inseto;

import academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02MetodosClasses.dAnimal.Model.Animal;

public class Oviparo extends Animal {

    int emOvos = 0;


    @Override
    public void reproduzirSexuado(int especimesReproduzir){
        int casais = especimesReproduzir / 2;
        if (emOvos == 0 && !this.extinto && this.quantidade > 1 && especimesReproduzir > 1){

            this.emOvos = casais*this.capacidadeReprodutiva;
            System.out.println("Cada casal ("+ casais +") de " + this.especie + " botou ovos: "+ this.capacidadeReprodutiva);
            System.out.println("Nova população: " + this.quantidade);
            System.out.println("Ovos a chocar: " + this.emOvos);
        }

        else if (!this.extinto && this.quantidade > 1 && especimesReproduzir > 1){
            this.quantidade =+ this.emOvos;
            this.emOvos = casais*this.capacidadeReprodutiva;
            System.out.println("Cada casal ("+ casais +") de " + this.especie + " botou ovos:  "+ this.capacidadeReprodutiva);
            System.out.println("Nova população: " + this.quantidade);
            System.out.println("Ovos a chocar: " + this.emOvos);

        }
        else{
            System.out.println("O animal não tem população suficiente :/ ");
        }
        divider();

    }


}
