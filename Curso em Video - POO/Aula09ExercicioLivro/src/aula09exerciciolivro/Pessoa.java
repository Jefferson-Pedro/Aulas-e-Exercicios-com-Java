package aula09exerciciolivro;
/**
 *
 * @author JeffersonPedro
 */
public class Pessoa {
 private String nome;
 private int idade;
 private char sexo;
 
 
    public void fazerAniver(){
        this.idade++;
    }
    public void qtdLivros(){
     
    }
 
//                  CONSTRUTOR

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
 
     //             METODOS ESPECIAIS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
}
