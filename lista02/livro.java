package lista02;

class Livro extends Publicacao{
    private String titulo;
    private float preco;
    private int qdePaginas;

    public Livro(String titulo, float preco, int qdePaginas){
        super(titulo, preco);
        this.qdePaginas = qdePaginas;
    }

    public int getQdePaginas(){
        return qdePaginas;
    }

    public void setQdePaginas(int qdePaginas){
        this.qdePaginas = qdePaginas;
    }

    public void imprime(){
        System.out.format("Quantidade de paginas: %d", qdePaginas);
    }
}