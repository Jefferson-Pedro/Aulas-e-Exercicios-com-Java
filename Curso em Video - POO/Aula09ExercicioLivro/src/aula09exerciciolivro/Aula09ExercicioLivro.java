package aula09exerciciolivro;
/**
 *
 * @author JeffersonPedro
 */
public class Aula09ExercicioLivro {
    public static void main(String[] args) {
      
        Pessoa [] p = new Pessoa[2];
        Livro [] l = new Livro [3];
        
        p[0] = new Pessoa("Pedro", 28, 'M');
        p[1] = new Pessoa("Anna", 27, 'F');
        
        l[0] = new Livro("Java para Iniciantes", "Profº Guanabara", 300, p[0]);
        l[1] = new Livro("Namoro Santo", "Canção Nova", 100, p[1]);
        l[2] = new Livro("Agape", "Padre Marcelo Rossi", 280, p[0]);
        
        l[0].abrir();
        l[0].avancarPag();
        l[0].folhear(10);
        System.out.println(l[0].status());
        
        System.out.println("================================");
        
        l[1].abrir();
        l[1].avancarPag();
        l[1].folhear(10);
        System.out.println(l[1].status());
        
        
    }
    
}
