package filas;

/**
 *
 * @author jpedro
 */
public class Fila {
    private int vetor [];
    private int primeiro;
    private int ultimo;
    private int total;

    public Fila() {
        this.vetor = new int[4];
        this.primeiro = 0;
        this.ultimo = 0;
        this.total = 0;
    }
    
    public void inserir(int e){
        if(isFull()){
            System.out.println("[ERRO] A fila já está cheia!");
        }else{
        vetor[ultimo] = e;
        ultimo = (ultimo + 1) % vetor.length; //if(ultimo == 4) ultimo = 0;
        total++;
        }
    }
    public int remover(){
        int x = 0;
        if(this.isEmpty()){
            System.out.println("[ERRO] A fila já está vazia!");
        }else{
        x = vetor[primeiro];
        primeiro = (primeiro + 1) % vetor.length;
        total --;
        }
        return x;
    }
    public boolean isEmpty(){
        return total == 0;
    }
    public boolean isFull(){
        return total == vetor.length;
    }
    
    public void status(){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento inserido: " + vetor[i]);
        }
    }
}
