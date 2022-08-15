package classepilha;
public class Pilha {
   private int vetor[];
   private int topo;

    public Pilha() {
        vetor = new int[5];
        topo = -1 ;
    }
    
    public void push(int e){
        if(isFull()){
            System.out.println("A pilha já está cheia");
        }else{
            topo++;
            vetor[topo] = e;
        }
    }
    public int pop(){
         int e = 0 ;
        if(IsEmpty()){
            System.out.println("A pilha está vazia");
        }else{
             e = vetor[topo];
             topo --;
        }
      
        return e;
    }
    public int top(){
        return vetor[topo];
    }
    public boolean IsEmpty(){
        return(topo == -1);
    }
    public boolean isFull(){
        return (topo == 9);
    }

    public void status(){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Empilhei " + i + " = " + vetor[i]);
        }
    }
}
