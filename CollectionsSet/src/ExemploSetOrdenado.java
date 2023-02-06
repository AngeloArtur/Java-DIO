import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.lang.Comparable;

/*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25

1 - Ordem aleatória
2 - Ordem de inserção
3 - por ordem de tempo
4 - Ordem Nome/Gênero/TempoEpisódio
*/

public class ExemploSetOrdenado {
    public static void main(String[] args) {
        
        System.out.println("Ordem aleatória:");
        Set<Serie> minhasSeries = new HashSet<>();
        minhasSeries.add(new Serie("got", "fantasia", 60));
        minhasSeries.add(new Serie("dark", "drama", 60));
        minhasSeries.add(new Serie("that '70s show", "comédia", 25));
        
        for (Serie series : minhasSeries) {
            System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpisodio());
        }

        System.out.println("\nOrdem de inserção: ");
        Set<Serie> minhaSeries1 = new LinkedHashSet<>();
        minhaSeries1.add(new Serie("got", "fantasia", 60));
        minhaSeries1.add(new Serie("dark", "drama", 60));
        minhaSeries1.add(new Serie("that '70s show", "comédia", 25));

        for (Serie serie : minhaSeries1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\nPor ordem de tempo:");
        Set<Serie> minhaSeries2 = new TreeSet<>(minhaSeries1);
        for (Serie serie : minhaSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\nOrdem Nome/Gênero/TempoEpisódio");
        Set<Serie> minhaSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempo());
        minhaSeries3.addAll(minhaSeries2);
        for (Serie serie : minhaSeries3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{nome: " + nome + " gênero: " + genero + " tempo de episódio: " + tempoEpisodio + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio =  Integer.compare(this.tempoEpisodio, serie.getTempoEpisodio());
        if(tempoEpisodio != 0) {
            return tempoEpisodio;
        }
        return this.getGenero().compareTo(serie.getGenero());
    }

}

class ComparatorNomeGeneroTempo implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) {
            return nome;
        }

        int genero = s1.getGenero().compareTo(s2.getNome());
        if(genero != 0) {
            return genero;
        }
        
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}