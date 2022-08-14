//CLASSE
package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Quantidade de carga: " + this.carga);
        System.out.println("Ela está tampada? " + this.tampada);
    }
    void rabiscar(){
       if(this.tampada == true){
           System.out.println("[ERRO] Não posso rabiscar!");
       } else{
           System.out.println("Posso rabiscar!");
       }
    }
    void tampar(){
        this.tampada = true; // this é o nome do objeto que chamou;
    }
    void destampar(){
        this.tampada = false;
    }
}
