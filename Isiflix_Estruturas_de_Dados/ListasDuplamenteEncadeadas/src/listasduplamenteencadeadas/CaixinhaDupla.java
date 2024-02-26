package listasduplamenteencadeadas;
/**
 *  CLASSE AUTO REFERENCIAVEL
 * @author JeffersonPedro
 */
public class CaixinhaDupla {
    private int elemento; 
    private CaixinhaDupla proximo;
    private CaixinhaDupla anterior;

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public CaixinhaDupla getProximo() {
        return proximo;
    }

    public void setProximo(CaixinhaDupla proximo) {
        this.proximo = proximo;
    }

    public CaixinhaDupla getAnterior() {
        return anterior;
    }

    public void setAnterior(CaixinhaDupla anterior) {
        this.anterior = anterior;
    }
    
    
}
