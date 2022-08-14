package projetofinaljava;
public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistindo;
    
    //                  CONSTRUTOR

    public Gafanhoto(String nome, int idade, char sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistindo = 0;
    }
    
    //              METODOS ESPECIAIS
    
    public void viuMaisUm(){
        
    }

    //          METODOS IMPLEMENTADOS
    
    @Override
    protected void ganharExp() {
    
    }

    //             GESTS E SETS

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\nlogin=" + login + ", "
                + "totAssistindo=" + totAssistindo + '}';
    }
    
    
}
