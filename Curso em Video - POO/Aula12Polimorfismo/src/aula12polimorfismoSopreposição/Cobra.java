package aula12polimorfismoSopreposição;

import java.util.Scanner;

public class Cobra extends Reptil{
    private String tipo;
    private String especie;
    
    public void especieDeCobra(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual a especie de cobra?");
        especie = ler.nextLine();
        status();
    }
    
    private void status(){
        System.out.println("A especie registrada é: " + this.especie);
    }
}
 