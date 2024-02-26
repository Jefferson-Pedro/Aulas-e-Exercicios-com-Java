package listasencadeadas;
/**
 * @author JeffersonPedro
 */
public class Lista {
  private Caixinha inicio; //Objeto referencia;

  //criando a lista vazia{
    public Lista(){
      this.inicio = null;
    }


  public void inserir(int elemento){
    //Criando nova Caixinha (obj);
    Caixinha nova = new Caixinha();
    nova.setElemento(elemento); // Insere o elemento na caixinha;
    nova.setProximo(null);      // Faz apontar para nulo;

    //Verifica se é a 1º caixinha;
    if(inicio == null){
      inicio = nova;            //Apontando a referência (ObjxObj);
    }
    else{                      //Já tem algo na lista (caixinha);
      Caixinha aux;
      aux = inicio;
    // Vai percorrer até chegar na ultima caixinha que aponta para o null;
      while(aux.getProximo() != null){ 
        aux = aux.getProximo();
      }
      aux.setProximo(nova);
    }
  }

  
  public int retirar(){
    if (inicio != null) {
      Caixinha aux = inicio;
      int elemento = aux.getElemento();
      inicio = aux.getProximo();
      return elemento;  
    }else{
      throw new RuntimeException("Lista Vazia!");
    }
  }


  public void listar(){
    if(inicio == null){
      System.out.println("Nada a exibir - a lista está vazia!");
    }
    else{
      Caixinha aux = inicio;
      while(aux != null){
        System.out.println("Elemento visto: " + aux.getElemento());
        aux = aux.getProximo();
      }
    }
  }


  public boolean isEmpty(){
   return this.inicio == null;
  }
}