package aula11heranca;
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void receberAumento(){
        float novoSalario = this.salario * 2;
        System.out.println("Seu novo salário é: " + novoSalario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
