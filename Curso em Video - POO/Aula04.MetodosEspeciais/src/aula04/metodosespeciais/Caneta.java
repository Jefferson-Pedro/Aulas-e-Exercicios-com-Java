
package aula04.metodosespeciais;

public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;                //ALT+INSERT
    private String cor;
    
    public Caneta(String m, String c, float p){ //Metodo construtor, determina que ações devem ser executadas quando há criação de um objeto.
        this.modelo = m;
        this.cor = c;
        this.ponta = p; //ou setPonta(p);
        this.tampar();
        
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(Float p){
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("POnta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
