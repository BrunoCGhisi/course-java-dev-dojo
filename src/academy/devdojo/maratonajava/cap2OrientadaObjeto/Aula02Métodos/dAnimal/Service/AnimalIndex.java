package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Métodos.dAnimal.Service;

import academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Métodos.dAnimal.Model.Animal;

public class AnimalIndex {
    public static void main(String[] args) {
        Animal tucano = new Animal();
        tucano.setEspecie("Tucano");
        tucano.setQuantidade(2);
        tucano.setCapacidadeReprodutiva(2);
        tucano.setIsSexuado("Sim");
        tucano.exiberFicha();


    }
}
