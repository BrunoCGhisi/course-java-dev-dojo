package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02MetodosClasses.dAnimal.Model.Bacteria;

import academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02MetodosClasses.dAnimal.Interfaces.ReprodutorAssexuado;
import academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02MetodosClasses.dAnimal.Model.Animal;

public class Platelminto extends Animal implements ReprodutorAssexuado {

    @Override
    public void reproduzirSexuado(int especimesReproduzir){

        if (!this.extinto && this.quantidade > 1 && especimesReproduzir > 1 ){
            int casais = especimesReproduzir / 2;

            this.quantidade = this.quantidade+(casais*this.capacidadeReprodutiva);
            System.out.println("Cada casal ("+ casais +") de " + this.especie + " reproduziu "+ this.capacidadeReprodutiva);
            System.out.println("Nova população: " + this.quantidade);
        }
        else{
            System.out.println("O animal não tem população suficiente :/ ");
        }
        divider();

    }

    @Override
    public void reproduzirBiparticao(int especimesReproduzir){
        if (!this.extinto && especimesReproduzir > 0 ) {
            this.quantidade = this.quantidade + (especimesReproduzir * 2);
            System.out.println("Cada indivíduo de " + this.especie + " duplicou " + especimesReproduzir);
            System.out.println("Nova população: " + this.quantidade);
            divider();
        }
        else{
            System.out.println("O animal não tem população suficiente :/ ");
            divider();
        }
    }
}