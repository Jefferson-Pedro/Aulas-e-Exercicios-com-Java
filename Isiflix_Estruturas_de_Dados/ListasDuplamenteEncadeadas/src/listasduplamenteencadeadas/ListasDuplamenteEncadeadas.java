package listasduplamenteencadeadas;
/**
 * @author JeffersonPedro
 */
public class ListasDuplamenteEncadeadas {
    public static void main(String[] args) {
        ListasCirculares lista = new ListasCirculares();
        
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.inserir(4);
        lista.inserir(5);
        lista.inserir(6);
        
        lista.exibirNaOrdem();
        //lista.exibirNaOrdemInversa();
        lista.size();
    }
    
}
