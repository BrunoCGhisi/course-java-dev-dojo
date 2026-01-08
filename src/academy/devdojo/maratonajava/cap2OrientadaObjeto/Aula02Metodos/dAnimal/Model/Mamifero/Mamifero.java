package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Metodos.dAnimal.Model.Mamifero;

import academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Metodos.dAnimal.Model.Animal;

public class Mamifero extends Animal {

    @Override
    public void reproduzir(int especimesReproduzir){
        if (this.extinto || this.quantidade < 2 || especimesReproduzir < 2){
            System.out.println("O animal não tem população suficiente ): ");
        }
        else{
            especimesReproduzir = especimesReproduzir / 2;
            this.quantidade = this.quantidade+(especimesReproduzir*this.capacidadeReprodutiva);
            System.out.println(this.quantidade);
        }
    }
}