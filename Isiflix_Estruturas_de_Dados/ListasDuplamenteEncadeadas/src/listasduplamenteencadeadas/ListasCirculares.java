package listasduplamenteencadeadas;

/**
 * @author JeffersonPedro
 */
public class ListasCirculares {
    private CaixinhaDupla inicio;
    private int tamLista;

    public ListasCirculares() {
        this.inicio = null;
        this.tamLista = 0;
    }
    public boolean isEmpty(){
        return (this.inicio == null);
    }
    public void inserir(int elemento){
       CaixinhaDupla nova = new CaixinhaDupla();
       nova.setElemento(elemento);
       
       if(this.isEmpty()){
          nova.setAnterior(nova);
          nova.setProximo(nova);
          inicio = nova;
       }
       else{ //Assumindo que a lista não está vazia:
           //Visita cada elemento da lista até o ultimo que aponta para inicio.
           CaixinhaDupla aux = inicio; 
           while(aux.getProximo() != inicio){
               aux = aux.getProximo();
           }
           inicio.setAnterior(nova);
           nova.setProximo(inicio);
           
           aux.setProximo(nova);
           nova.setAnterior(aux);
           
          
           
       }
    }
    public void exibirNaOrdem(){
        CaixinhaDupla aux = inicio;
        do{
            System.out.println("Elemento da lista = " + aux.getElemento());
            aux = aux.getProximo();
            tamLista++;
        }
        while(aux != inicio);
         
    }
    public void exibirNaOrdemInversa(){
       CaixinhaDupla tmp;
        tmp = inicio;
        do{
          System.out.println("Elemento da Lista = " + tmp.getElemento());
          tmp = tmp.getAnterior();
          
        }while(tmp != inicio);
    }
    public void size(){
        
        System.out.println("Tamanho da lista: " + tamLista);
    }
    
}
