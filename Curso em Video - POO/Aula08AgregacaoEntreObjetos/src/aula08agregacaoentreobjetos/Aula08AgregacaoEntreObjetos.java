package aula08agregacaoentreobjetos;
/**
 *
 * @author jpedro
 */
public class Aula08AgregacaoEntreObjetos {
 public static void main(String[] args) {
        //criar vetor de 6 posições
        Lutador l [] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f,
        68.8f, 11, 2,1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f,
        57.8f, 14, 2,3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.658f,
        80.9f, 12, 2,1);
        l[3] = new Lutador("Dead Code", "Australia", 28, 1.93f,
        81.6f, 13, 0,2);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70f,
        119.3f, 5, 4,3);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f,
        105.7f, 12, 2,4);
        
        
       /* l[3].perderLuta();
        l[3].status();*/
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[4], l[5]);
        UEC01.lutar();
       /* l[0].status();
        l[1].status();*/
    }
    
}