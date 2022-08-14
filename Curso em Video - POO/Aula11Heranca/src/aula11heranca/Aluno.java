 package aula11heranca;
    public class Aluno extends Pessoa { //public final class Aluno extends Pessoa (classe final nao pode ter filhos)
    private int matricula;
    private String curso;
    
    public void pagarMensalidade(){ // public final void pagarMensalidade(o metodo não pode ser sobreposto)
        System.out.println("Pagando mensalidade do(a) aluno(a): " + this.nome);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
