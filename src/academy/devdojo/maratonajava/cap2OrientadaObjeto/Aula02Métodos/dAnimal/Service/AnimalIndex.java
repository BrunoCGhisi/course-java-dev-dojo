package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Métodos.dAnimal.Service;

import academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Métodos.dAnimal.Model.Animal;

public class AnimalIndex {
    public static void main(String[] args) {
        Animal tucano = new Animal();
        tucano.setEspecie("Tucano");
        tucano.setQuantidade(10);
        tucano.setCapacidadeReprodutiva(4);
        tucano.setIsSexuado("Sim");
        tucano.exibirFicha();

        tucano.reproduzir(5);
        tucano.utilizarCobaias(2);
    }
}
