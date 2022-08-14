package aula03;

/**
 *
 * @author JeffersonPedro
 */
public class Aula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
       // c1.tampada = true;
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
    
}
