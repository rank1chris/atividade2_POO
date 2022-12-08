package lista02;

class audioLivro extends Publicacao{
    private String titulo;
    private float preco;
    private int duracaoMinutos;
    private int duracaoSegundos;

    public audioLivro(String titulo, float preco, int duracaoMinutos, int duracaoSegundos){
        super(titulo, preco);
        this.duracaoMinutos = duracaoMinutos;
        this.duracaoSegundos = duracaoSegundos;
    }

    public int getDuracaoMinutos(){
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos){
        this.duracaoMinutos = duracaoMinutos;
    }
        
    public int getDuracaoSegundos(){
        return duracaoSegundos;
    }

    public void setDuracaoSegundos(int duracaoSegundos){
        this.duracaoSegundos = duracaoSegundos;
    }

    public void imprime(){
        System.out.format("Duracao: %d:%d", duracaoMinutos, duracaoSegundos);
    }
}