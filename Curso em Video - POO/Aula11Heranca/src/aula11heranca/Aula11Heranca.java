package aula11heranca;
public class Aula11Heranca {
    
    public static void main(String[] args) {
        
         //Pessoa p1 = new Pessoa();   Não se pode instanciar classes abstratas, servem apenas de modelos
        /* Visitante v1 = new Visitante();
         v1.setNome("Jefferson");
         v1.setIdade(22);
         v1.setSexo("M");
         System.out.println(v1.toString());*/
         
         Aluno a1 = new Aluno();
         a1.setNome("Sthefanie");
         a1.setMatricula(4526);
         a1.setCurso("Nutrição");
         a1.setIdade(25);
         a1.setSexo("F");
         a1.pagarMensalidade();
         
         Bolsista b1 = new Bolsista();
         b1.setMatricula(2526);
         b1.setNome("Vanessa");
         b1.setBolsa(12.5f);
         b1.setSexo("M");
         b1.pagarMensalidade();
    }
    
}
