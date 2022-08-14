package projetofinaljava;
/**
 * PROJETO YOUTUBE
 * @author JeffersonPedro
 */
public class ProjetoFinalJava {
    public static void main(String[] args) {
        Video v [] = new Video[3];
        v[0] = new Video("Aula de Java POO");
        v[1] = new Video(" Palestra sobre Nutrição Comportamental");
        v[2] = new Video("Morning Show");
               
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jefferson Pedro", 28, 'M', "Jpedro");
        g[1] = new Gafanhoto("Anna Thays", 27, 'F', "Athay");
        
        Visualizacao vis [] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]); //Jpedro assiste Palestra
        vis[0].avaliar();
        System.out.println(vis[0].toString()); 
        
        vis[1] = new Visualizacao(g[0], v[1]); // Jpedro assiste Aula
        vis[0].avaliar(87.0f);
        System.out.println(vis[1].toString());
        
        /*System.out.println("VIDEOS\n---------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());        
        System.out.println("GAFANHOTOS\n-----------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
    }
    
}
