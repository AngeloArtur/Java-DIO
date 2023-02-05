import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Gatos {
    
/*Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);
Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo

1 - Mostre pela ordem de inserção
2 - Mostre em ordem aleatória
3 - Ordem idade
4 - Comparando por cor
5 -  Ordem nome, cor e idade
*/
    public static void main(String[] args) {
        List<MeusGatos> gatos = new ArrayList<>(){
            {
                add(new MeusGatos("Jon", 18, "preto"));
                add(new MeusGatos("Simba", 6, "tigrado"));
                add(new MeusGatos("Jon", 12, "amarelo"));
                add(new MeusGatos("Bino", 10, "amarelo"));
                add(new MeusGatos("Jon", 12, "cinza"));

            }
        };
        System.out.println("Ordem de inserção:");
        System.out.println(gatos);

        System.out.println("Ordem aleatória: :");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("Ordem natural (Nome): ");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("Comparando por idade");
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("Comparando por cor");
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);

        System.out.println("Compare por nome, cor e idade: ");
        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);
    }

}

class MeusGatos implements Comparable<MeusGatos> {
    private String nome;
    private Integer idade;
    private String cor;
    
    public MeusGatos(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }
    
    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{nome: " + nome + " idade: " + idade + " cor: " + cor + "}";
    }

    @Override
    public int compareTo(MeusGatos gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<MeusGatos> {
    @Override
    public int compare (MeusGatos gatos1, MeusGatos gatos2) {
        return Integer.compare(gatos1.getIdade(), gatos2.getIdade());
    }
}

class ComparatorCor implements Comparator<MeusGatos> {
    @Override
    public int compare (MeusGatos cor1, MeusGatos cor2) {
        return cor1.getCor().compareToIgnoreCase(cor2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<MeusGatos> {
    @Override
    public int compare(MeusGatos g1, MeusGatos g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;
        
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}