package aula07relacionamentoentreclasses;
/**
 *
 * @author JeffersonPedro
 */
public class Lutador {
   private String nome;
   private String nacionalidade;
   private int idade;
   private float altura;
   private float peso;
   private String categoria;
   private int vitorias, derrotas, empates;
   
      
                        //METODOS ESPECIAIS
   public void apresentar(){
       System.out.println("--------------------------------------------------------");
       System.out.println("Senhores e Senhoras, boa noiteeee! Hoje teremos uma luta incrivel!");
       System.out.println("Do lado direito temos: " + this.getNome());
       System.out.println("A Origem dele é: " + this.getNacionalidade());
       System.out.println("Com: " + this.getIdade() + " anos e " + this.getAltura() + " de altura!");
       System.out.println("Pesando: " + this.getPeso() + "Kg");
       System.out.println("Ganhou: " + this.getVitorias());
       System.out.println("Perdeu: " + this.getDerrotas());
       System.out.println("Empatou: " + this.getEmpates());
       
   }
   public void status(){
       System.out.print("Nome: " + this.getNome() + ", peso: " + this.getCategoria());
       System.out.print(", Nº de Vitórias: " + this.getVitorias());
       System.out.print(", Nº de Derrotas: " + this.getDerrotas());
       System.out.println(", Nº de Empates: " + this.getEmpates());
   }
   public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
   }
   public void perderLuta(){
       this.setDerrotas(this.getDerrotas() + 1);
   }
   public void empatarLuta(){
       this.setEmpates(this.getEmpates() + 1);
   }
  
                        //CONTRUTOR
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

                        //SETS E GETS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
       this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.getPeso() <52.2){
            this.categoria = "Invalido";
        }else if (getPeso() <=70.3){
            this.categoria = "Leve";
        }else if (getPeso() <=83.9){
            this.categoria = "Médio";
        }else if (getPeso() <=120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
        
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
  