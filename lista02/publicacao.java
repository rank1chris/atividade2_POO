package lista02;

class Publicacao{
    private String titulo;
    private float preco;

    public Publicacao(String titulo, float preco){
        this.titulo = titulo;
        this.preco = preco;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public float getPreco (){
        return preco;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public void imprime(){
        System.out.format("Titulo: %s, Preco: R$%d", titulo, preco);
    }
}