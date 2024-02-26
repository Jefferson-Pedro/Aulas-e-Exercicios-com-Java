package listasencadeadas;
/**
 * @author JeffersonPedro
 */
public class Caixinha {
  private int elemento;
  private Caixinha proximo; //Objeto de referencia;

  public void setElemento(int elemento){
    this.elemento = elemento;
  }
  public int getElemento(){
    return this.elemento;
  }
  public void setProximo(Caixinha proximo){
    this.proximo = proximo; //vai receber novo obj e apontar;
  }
  public Caixinha getProximo(){
    return this.proximo;
  }
}
