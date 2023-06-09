package aula09;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String detalhes() {
        return "Livro{" + 
                "\n titulo=" + titulo + 
                "\n autor=" + autor + 
                "\n totPaginas=" + totPaginas + 
                ", pagAtual=" + pagAtual + 
                "\n aberto=" + aberto + 
                "\n leitor=" + leitor.getNome() + 
                ", idade=" + leitor.getIdade() + 
                ", sexo=" + leitor.getSexo() + "\n}";
    }
    
    

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

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
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

    @Override
    public void abrir() {
        this.setAberto(true);
        this.setPagAtual(1);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        this.setPagAtual(0);
    }

    @Override
    public void folhear(int p) {
        if (this.getTotPaginas() >= p){
            if (this.getPagAtual() == 0){
                this.setAberto(true);
            }
        this.setPagAtual(p);
        } else {
            this.setPagAtual(0);
        }
    }

    @Override
    public void avancarPag() {
        if(this.getPagAtual() == 0){
            this.setAberto(true);
        }
        if (this.getPagAtual() == this.getTotPaginas()){
            this.setPagAtual(0);
        } else{
            this.setPagAtual(this.getPagAtual() + 1);
        }
    }

    @Override
    public void voltarPag() {
        if(this.getPagAtual() == 1){
            this.fechar();
        } 
        if (this.getPagAtual() == 0){
            this.setPagAtual(0);
        } else{
            this.setPagAtual(this.getPagAtual() - 1);
        }
    }
}
