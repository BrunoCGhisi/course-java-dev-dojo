package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Metodos.dAnimal.Service;

import academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Metodos.dAnimal.Model.Animal;
import academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Metodos.dAnimal.Model.Bacteria.Platelminto;
import academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Metodos.dAnimal.Model.Inseto.Oviparo;
import academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Metodos.dAnimal.Model.Mamifero.Mamifero;

import java.util.ArrayList;
import java.util.List;

public class AnimalService {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        Animal tucano = new Oviparo();
        tucano.setEspecie("Tucano");        //String
        tucano.setQuantidade(10);           //int
        tucano.setCapacidadeReprodutiva(3); //int

        //isExtinto automated by quantidade //boolean
        tucano.exibirFicha();

        // tucano.utilizarCobaias(2);

        Animal raposa = new Mamifero();
        raposa.setEspecie("Raposa");
        raposa.setQuantidade(10);
        raposa.setCapacidadeReprodutiva(4);

        Animal planaria = new Platelminto();
        planaria.setEspecie("Planaria");
        planaria.setQuantidade(79);
        planaria.setCapacidadeReprodutiva(5);

        Animal dodo = new Oviparo();
        dodo.setEspecie("Dodô");
        dodo.setQuantidade(0);
        dodo.setCapacidadeReprodutiva(1);

        animais.add(tucano);
        animais.add(raposa);
        animais.add(planaria);
        animais.add(dodo);

        Animal.getVivos(animais);
        planaria.exibirFicha();

        Animal.getQuantidadeTotal(animais);
        Animal.sumQuantidade(animais);

        raposa.reproduzir(5);


    }

}
