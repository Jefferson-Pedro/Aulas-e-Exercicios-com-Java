package projetofinaljava;
public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    //          CONSTRUTOR
    
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float p){
        int tot = 0;
        if(p <= 20){
            tot = 3;
        }else if(p <= 50){
            tot = 5;
        }else if(p <= 90){
            tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    
    //          GET E SET
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualização: \n" + //super.toString() +
                "Espectador= " + espectador + ", filme= " + filme + '}';
    }
    
    
}
