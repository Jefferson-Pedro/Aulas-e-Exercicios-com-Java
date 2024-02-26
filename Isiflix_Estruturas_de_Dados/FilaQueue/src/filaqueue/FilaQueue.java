package filaqueue;

import java.util.Queue;
import java.util.LinkedList;

/**
 *
 * @author jpedro
 */
public class FilaQueue {
    public static void main(String[] args) {
        
        Queue<String> frutas = new LinkedList();
        
        //ADICIONA ELEMENTOS NA FILA;
        frutas.add("Banana");
        frutas.add("Maça");
        frutas.add("Pêra");
        frutas.add("Mamão");
        
        System.out.println(frutas);
        
        //RETORNA O PRIMEIRO ELEMENTO DA FILA
        System.out.println("Primeiro elemento da Fila: " + frutas.peek());
        
        //PARA RETIRAR ELEMENTOS DA FILA
        System.out.println("Elemento retirado: " + frutas.poll());
        System.out.println(frutas);
        //
        
        
        //VERIFICA SE FILA ESTÁ OU NÃO VAZIA
        if(frutas.isEmpty()){
            System.out.println("Fila Vazia");
        }else{
            System.out.println("Fila com elementos");
        }
        
    }
    
}
