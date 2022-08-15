package filas;

/**
 *
 * @author jpedro
 */
public class ProgramaPrincipal {
    public static void main(String[] args) {
        Fila f = new Fila();
        
        f.inserir(1);
        f.inserir(2);
        f.inserir(3);
        f.inserir(4);
                        
        f.status();
        
        while(!f.isEmpty()){
            int retirado = f.remover();
            System.out.println("Elemento retirado: " + retirado);
        }
    }
}
