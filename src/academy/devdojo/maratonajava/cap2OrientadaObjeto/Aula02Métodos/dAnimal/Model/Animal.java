package academy.devdojo.maratonajava.cap2OrientadaObjeto.Aula02Métodos.dAnimal.Model;

public class Animal {
    private String especie;
    private int quantidade;
    private int capacidadeReprodutiva;
    private boolean isSexuado;
    private boolean extinto;

    public void exibirFicha()
    {
        System.out.println("Espécie: " + especie);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("CapacidadeReprodutiva: " + capacidadeReprodutiva);
        System.out.println("Tipo de Reprodução: " + (isSexuado ? "Sexuado" : "Assexuado"));
        System.out.println("Extinto: " + (extinto ? "Extinto" : "Na natureza"));
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

    public void setIsSexuado(String isSexuado) {
        isSexuado = isSexuado.toLowerCase();
        this.isSexuado = isSexuado.equals("sim");
    }

    public void reproduzir(int especimesReproduzir){

        if (this.extinto){
            System.out.println("Não é possível se reproduzir, todos morreram. /: ");
        }
        else{
            if (isSexuado){ //isSexuado True
                if (this.quantidade == 1){
                    System.out.println("Não é possível reproduzir com apenas 1 espécime");
                }
                else{
                    reproducaoSexuada(especimesReproduzir/2);
                }
            }
            else { //isSexuado False
                reproducaoAssexuada(especimesReproduzir);
            }
        }
    }

    private void reproducaoSexuada(int x){
        this.quantidade = this.quantidade+(this.capacidadeReprodutiva*(x/2));
        System.out.println("Nova Quantidade: " + this.quantidade);
    }

    private void reproducaoAssexuada(int x){
        this.quantidade = this.quantidade+(this.capacidadeReprodutiva*x);
        System.out.println("Nova Quantidade: " + this.quantidade);
    }



}

