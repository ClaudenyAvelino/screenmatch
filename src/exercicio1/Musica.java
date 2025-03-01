package exercicio1;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacoes;
    int numAvaliacoes;

    public void exibeFichaTecnica(){
        System.out.println("Título da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public void avalia(double nota) {
        this.somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes /numAvaliacoes;
    }

    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Nome da Música";
        minhaMusica.artista = "Nome do Artista";
        minhaMusica.anoLancamento = 2023;

        minhaMusica.exibeFichaTecnica();

        minhaMusica.avalia(4.5);
        minhaMusica.avalia(3.8);
        minhaMusica.avalia(5.0);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("Média das avaliações: " + mediaAvaliacoes);
    }
}
