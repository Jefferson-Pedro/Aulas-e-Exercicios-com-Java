package aula03;

/**
 *
 * @author JeffersonPedro
 */
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Quantidade de carga: " + this.carga);
        System.out.println("Ela está tampada? " + this.tampada);
    }
   protected void rabiscar(){
       if(this.tampada == true){
           System.out.println("[ERRO] Não posso rabiscar!");
       } else{
           System.out.println("Posso rabiscar!");
       }
    }
    public void tampar(){
        this.tampada = true; // Os metodos sendo publicos podem mexer nos atributos privados;
    }
    public void destampar(){
        this.tampada = false;
    }
}


