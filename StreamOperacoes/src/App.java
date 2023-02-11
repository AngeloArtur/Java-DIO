import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> numerosAleatorios = new ArrayList<>() {{
            add("1");
            add("0"); 
            add("4");
            add("1");
            add("2"); 
            add("3"); 
            add("9"); 
            add("9"); 
            add("6"); 
            add("5");
        }};

        System.out.println("Imprima todos os elementos dessa lista: ");
        /*
        //classe anônima
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        
        //função lambda
        numerosAleatorios.stream().forEach(s -> System.out.print(s + " "));
        /*
        //Reference method
        numerosAleatorios.forEach(System.out::println);
        */
        System.out.println("\nPegue os 5 primeiros numeros e coloque dentro de um set:");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Transforme a lista de Strings em uma lista de inteiros");
        /* 
        //Classe anônima
        numerosAleatorios.stream().map(new Function<String, Integer>() {

            @Override
            public Integer apply(String t) {
                // TODO Auto-generated method stub
                return Integer.parseInt(t);
            }
            
        }); 
        */
        
        /* 
        //Lambda
        numerosAleatorios.stream().map(s -> Integer.parseInt(s)); 
        */

        //Reference Method
        List<Integer> collectNumber = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        collectNumber.forEach(System.out::println);;

        /*
        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista");
        numerosAleatorios.stream().map(Integer::parseInt).filter(new Predicate<Integer>() {

            @Override
            public boolean test(Integer t) {
                // TODO Auto-generated method stub
                if(t%2 == 0 && t >2) {
                    return true;
                }
                return false;
            }
            
        }).collect(Collectors.toList()).forEach(System.out::println);;
         
         */

        List<Integer> filterNumber = numerosAleatorios.stream().map(Integer::parseInt).filter(i -> (i%2 == 0 && i>2)).collect(Collectors.toList());
        System.out.println(filterNumber);

        System.out.println("Mostre a média dos números");

        /* 
        numerosAleatorios.stream().mapToInt(new ToIntFunction<String>() {

            @Override
            public int applyAsInt(String value) {
                // TODO Auto-generated method stub
                return Integer.parseInt(value);
            }
            
        }); 
        */

        numerosAleatorios.stream().mapToInt(value -> Integer.parseInt(value)).average().ifPresent(System.out::println);;

        /* 
         numerosAleatorios.stream().mapToInt(Integer::parseInt);
         */

         System.out.println("Remova os valores impares");

         collectNumber.removeIf(Integer -> Integer%2 !=0);
         System.out.println(collectNumber);
    }
}
