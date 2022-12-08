import lista02.*;

public class TestaPublicacao{
    public static void main(String[] args) throws Exception{
        Publicacao p = new Publicacao("Titulo qualquer", 50f);
        Livro l = new Livro("Dom Casmurro", 25.0f, 250);
        audioLivro a = new audioLivro("Titulo qualquer2", 50f, 10, 50);
        p.imprime();
        l.imprime();
        a.imprime();
    }
}