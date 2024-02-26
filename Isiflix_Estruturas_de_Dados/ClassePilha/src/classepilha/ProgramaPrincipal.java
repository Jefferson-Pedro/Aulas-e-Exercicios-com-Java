package classepilha;

/**
 *
 * @author jpedro
 */
public class ProgramaPrincipal {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        
        //Empilha os dados
        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        p.push(5);
      
       //Mostra os dados da pilha empilhados;
        p.status();
        
        //Mostra quem está no topo;
        int r = p.top();
        System.out.println("Elemento do topo: " + r);
      
        //Desempilha e mostra os dados desempilhados;
        while(!p.IsEmpty()){
            int e = p.pop();
            System.out.println("Desempilhei: " + e);
        }
        
        //Para ver a msg de erro;
        int retira = p.pop();
    }
    
}
