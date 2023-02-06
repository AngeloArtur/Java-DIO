import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
*/

public class ArcoIris {
    public static void main(String[] args) throws Exception {
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("Vermelho");
        coresArcoIris.add("Alaranjado");
        coresArcoIris.add("Amarelo");
        coresArcoIris.add("Verde");
        coresArcoIris.add("Azul");
        coresArcoIris.add("Anil");
        coresArcoIris.add("Violeta");
        
        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra:");
        for (String string : coresArcoIris) {
            System.out.println(string);
        }

        System.out.println("\nA quantidade de cores que o arco-íris tem: " + coresArcoIris.size());

        System.out.println("\nExiba as cores em ordem alfabética");

        Set<String> coresArcoIris2 = new TreeSet<>();
        coresArcoIris2.addAll(coresArcoIris);
        for (String string : coresArcoIris2) {
            System.out.println(string);
        }
       
        System.out.println("\nExiba as cores na ordem inversa da que foi informada: ");
        List<String> coresArcoIrisReversa = new ArrayList<>();
        coresArcoIrisReversa.add("Vermelho");
        coresArcoIrisReversa.add("Alaranjado");
        coresArcoIrisReversa.add("Amarelo");
        coresArcoIrisReversa.add("Verde");
        coresArcoIrisReversa.add("Azul");
        coresArcoIrisReversa.add("Anil");
        coresArcoIrisReversa.add("Violeta");
        Collections.reverse(coresArcoIrisReversa);
        for (String string : coresArcoIrisReversa) {
            System.out.println(string);
        }

        System.out.println("\nExiba todas as cores que começam com a letra ”v”:");
        for (String string : coresArcoIrisReversa) {
            if(string.startsWith("V") || string.startsWith("v")) {
                System.out.println(string);
            }
        }

        System.out.println("\nRemova todas as cores que não começam com a letra ”v”:");
        Iterator<String> iterator = coresArcoIris.iterator();
        while(iterator.hasNext()){
            if(!iterator.next().startsWith("V")){
                iterator.remove();
            }
        }
        System.out.println(coresArcoIris);

        System.out.println("\nLimpe o conjunto:");
        coresArcoIris.removeAll(coresArcoIris);
        System.out.println(coresArcoIris);
        
        System.out.println("\nConfira se o conjunto está vazio: " + coresArcoIris.isEmpty());
    }
}
