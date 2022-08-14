package aula09exerciciolivro;
/**
 *
 * @author JeffersonPedro
 */
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    
    public String status() {
        return "Livro: \n" 
            + " Titulo= " + titulo + ", autor= " + autor + ".\n "
            + "Total de Paginas= " + totPag + ", Pagina Atual= " + pagAtual + 
            ".\n Aberto= " + aberto + 
            ".\n Leitor= " + leitor.getNome() 
            + ", idade= " + leitor.getIdade() + ", sexo= " + leitor.getSexo();
        
    }
  
    //          CONSTRUTOR

    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.leitor = leitor;
    }
    //          METODOS ESPECIAIS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //                  METODOS ABSTRATOS
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if(this.aberto && p <= this.totPag){
            this.pagAtual = p;
        }else{
            this.pagAtual = 0;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual ++;
    }

    @Override
    public void recuarPag() {
        this.pagAtual--;
    }
}
