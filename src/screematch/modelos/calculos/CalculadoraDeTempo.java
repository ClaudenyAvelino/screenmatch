package screematch.modelos.calculos;

import screematch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

/*    public void inclui(Filme f) {
        tempoTotal += f.getDuracaoEmMinutos();
    }
    public void inclui(Serie s){
        tempoTotal += s.getDuracaoEmMinutos();
    }*/
public void inclui(Titulo titulo) {
    System.out.println("Adicionando duração em minutos de " +titulo.getNome());
    tempoTotal += titulo.getDuracaoEmMinutos();
}
}
