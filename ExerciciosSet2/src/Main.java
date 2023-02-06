import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class Main {
    public static void main(String[] args) throws Exception {
        Set<LinguagemFavorita> linguagemFavoritas = new HashSet<>();
        linguagemFavoritas.add(new LinguagemFavorita("JavaScript", 1985, "VS Code"));
        linguagemFavoritas.add(new LinguagemFavorita("C++", 1983, "NEOVim"));
        linguagemFavoritas.add(new LinguagemFavorita("Java", 1991, "IntelliJ"));

        Set<LinguagemFavorita> linguagemFavoritas2 = new LinkedHashSet<>(linguagemFavoritas);

        System.out.println("Ordem de inserção");
        for (LinguagemFavorita linguagemFavorita : linguagemFavoritas2) {
            System.out.println(linguagemFavorita);
        }

        System.out.println("\n Ordem natural:");
        Set<LinguagemFavorita> linguagemFavoritas3 = new TreeSet<>(linguagemFavoritas);
        for (LinguagemFavorita linguagemFavorita : linguagemFavoritas3) {
            System.out.println(linguagemFavorita);
        }

        System.out.println("\nIDE");
        Set<LinguagemFavorita> linguagemFavoritas4 = new TreeSet<>(new ComparatorIde());
        linguagemFavoritas4.addAll(linguagemFavoritas);
        for (LinguagemFavorita linguagemFavorita : linguagemFavoritas4) {
            System.out.println(linguagemFavorita);
        }

        System.out.println("\nAno de criação e nome");
        Set<LinguagemFavorita> linguagemFavoritas5 = new TreeSet<>(new ComparatorAnoENome());
        linguagemFavoritas5.addAll(linguagemFavoritas);
        for (LinguagemFavorita linguagemFavorita : linguagemFavoritas5) {
            System.out.println(linguagemFavorita);
        }

        System.out.println("\nNome, ano de criação e IDE");
        Set<LinguagemFavorita> linguagemFavoritas6 = new TreeSet<>(new ComparatorNomeAnoIde());
        linguagemFavoritas6.addAll(linguagemFavoritas);
        for (LinguagemFavorita linguagemFavorita : linguagemFavoritas6) {
            System.out.println(linguagemFavorita);
        }

    }
}

