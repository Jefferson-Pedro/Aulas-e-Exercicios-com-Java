                        // PROJETO LIVRO 

package aula09exercicios;
/**
 *
 * @author jpedro
 */
public class Aula09Exercicios {
    public static void main(String[] args) {
        Pessoa [] p = new Pessoa [2];
        Livro [] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 'M', 28);
        p[1] = new Pessoa("Anna", 'F', 27);
        
        l[0] = new Livro("Nascido para amar", "Canção Nova", 355, p[0]);
        l[1] = new Livro("Ágape", "Padre Marcelo Rossi", 168, p[1]);
        l[1] = new Livro("Nasci para dar certo", "Canção Nova", 200, p[0]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        System.out.println("==============");
        System.out.println(l[1].detalhes());
    }
    
}
