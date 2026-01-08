package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02MetodosClasses.dAnimal.Model.Bacteria;

import academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02MetodosClasses.dAnimal.Interfaces.ReprodutorAssexuado;
import academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02MetodosClasses.dAnimal.Model.Animal;

public class Platelminto extends Animal implements ReprodutorAssexuado {

    @Override
    public void reproduzirSexuado(int especimesReproduzir){
        System.out.println("Reproduzindo");
    }

    @Override
    public void reproduzirBiparticao(int especimesReproduzir){
        this.quantidade = (especimesReproduzir*2);
    }
}
