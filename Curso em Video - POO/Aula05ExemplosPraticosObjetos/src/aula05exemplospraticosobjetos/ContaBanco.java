package aula05exemplospraticosobjetos;
 
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
   
    
    public void ContaBanco(){ // toda vez que criar uma conta nova, vai ser inicializada dessa forma
        this.setSaldo (0);
        this.status = false;
    }
    // METODOS PERSONALIZADOS 
    public void estadoAtual(){
        System.out.println("-------------------------------");
        System.out.println("Conta : " + this.getNumConta()); 
        System.out.println("Dono " + this.getDono());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC"){
            System.out.println("Sua conta Corrente foi aberta com sucesso");
            this.setSaldo (50);
        }else if( t == "CP"){
          System.out.println("Sua conta Poupança foi aberta com sucesso");
            this.saldo = 150;  
        }
        //System.out.println("Conta aberta com sucesso");
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Você possui dinheiro na conta, favor retirar para prosseguir");
        }else if(this.saldo < 0){
            System.out.println("Você possui um débito na sua conta! Regularize sua situação para prosseguir!");
        }else{
            setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void depositar(float v){
        if (this.status == true){
            System.out.println("Depósito concluido");
            this.saldo = this.saldo + v; // ou this.getSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono() );
        }else{
            System.out.println("Sua conta encontra-se inativa!");
        }
    }
    public void sacar(float saque){
        if(getStatus() == true){
            if(this.saldo < saque ){
                System.out.println("Você não possui saldo suficiente para realizar o saque"); 
            }else{
                this.setSaldo(this.getSaldo()-saque);//this.saldo = saldo - saque;
                System.out.println("Saque realzadao na conta de " + this.getDono());
            }
        }else{
            System.out.println("Impossivel sacar de uma conta inativa");
        }
        
    }
    public void pagarMensal(){
        int valor = 0;
        if(this.getTipo() == "CC"){
            valor = 12;
        }else if (this.getTipo() == "CP"){
            valor = 20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - valor );
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }else{
            System.out.println("Impossivel pagar um conta fechada");
        }
    }
    //METODOS ESPECIAIS 
    
    public void setNumConta(int nc) {
        this.numConta = nc;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return tipo;
    }
     public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return dono;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setStatus(boolean stt){
        this.status = stt;
    }
    public boolean getStatus(){
        return status;
    }
    

       
}
