package classepilhastack;

import java.util.Stack;

/** USANDO FORMA MAIS FACIL E SIMPLES PARA USAR PILHA
 * @author jpedro
 */
public class PilhaStack {
    public static void main(String[] args) {
        
        Stack<String> carros = new Stack<>();
        
        //Adicionando os valores na pilha
        carros.push("HRV");
        carros.push("Golf");
        carros.push("Polo");
        carros.push("Camaro");
        
        System.out.println(carros);
        
        //Mostrando os elementos da lista
        for(String c:carros){
            System.out.println(c);
        }
        
        System.out.println("Topo da Pilha: " + carros.peek());
        
        //Retorna e Retira elemento do topo;
        System.out.println("Elemento a ser retirado do topo: " + carros.pop());
        System.out.println(carros);
        
        //Verificando se a pilha está vazia
        if(carros.empty()){
            System.out.println("Pilha Vazia");
        }else{
            System.out.println("Pilha com elementos");
        }
    }
    
}
