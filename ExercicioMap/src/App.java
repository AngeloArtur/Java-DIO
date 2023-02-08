import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265

 1 - Crie um dicionário que relacione os estados e suas respectivas populações
 2 - Substitua a população do estado RN por : 3.534.165
 3 - Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione " + "PB - 4.039.277"
 4 - Exiba a população do estado PE
 5 - Exiba todos os estados e suas populaçãos na ordem em que foram informados
 6 - Exiba todos os estados e suas populações na ordem alfabética
 7 - Exiba o estado com o menor população e seu respectivo valor
 8 - Exiba o estado com a maior população e seu respectivo valor
 9 - Exiba a soma da população desses estados
 10 - Exiba a média da população deste dicionário de estados
 11 - Remova os estados com a população menor que 4.000.000
 12 - pague o dicionario de estados com suas respectivas populações estimadas
 13 - Confira se a lista está vazia
 */

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações");
        Map<String, Integer> popEstimada = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        for (Map.Entry<String, Integer> populacao: popEstimada.entrySet()) {
            System.out.println(populacao.getKey() + " = " + populacao.getValue());
        }

        System.out.println("\nSubstitua a população do estado RN por : 3.534.165");
        popEstimada.put("RN", 3534165);
        
        for (Map.Entry<String, Integer> populacao: popEstimada.entrySet()) {
            System.out.println(populacao.getKey() + " = " + populacao.getValue());
        }

        System.out.println("\nConfira se o estado da Paraíba (PB) está no dicionário, caso não, adicione " + "PB - 4.039.277");
        if(!popEstimada.equals("PB")) {
            popEstimada.put("PB", 4039277);
        }

        for (Map.Entry<String, Integer> populacao: popEstimada.entrySet()) {
            System.out.println(populacao.getKey() + " = " + populacao.getValue());
        }

        System.out.println("\nExiba a população do estado PE: " + popEstimada.get("PE"));

        System.out.println("\nExiba todos os estados e suas populaçãos na ordem em que foram informados");
        Map<String, Integer> popEstimada2 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};

        for (Map.Entry<String, Integer> populacao : popEstimada2.entrySet()) {
            System.out.println(populacao.getKey() + " = " + populacao.getValue());
        }

        System.out.println("\nExiba todos os estados e suas populações na ordem alfabética");
        Map<String, Integer> popEstimada3 = new TreeMap<>(popEstimada2);

        for (Map.Entry<String, Integer> populacao : popEstimada3.entrySet()) {
            System.out.println(populacao.getKey() + " = " + populacao.getValue());
        }

        String maiorPopEstado = "";
        String menorPopEstado = "";
        Collection<Integer> populacaoNova = popEstimada.values();
        int maiorPop = Collections.max(populacaoNova);
        int menorPop = Collections.min(populacaoNova);
        
        for (Map.Entry<String, Integer> populacao : popEstimada.entrySet()) {
            if (populacao.getValue().equals(maiorPop)) {
                maiorPopEstado = populacao.getKey();
                System.out.println("\nExiba o estado com o maior população e seu respectivo valor: " + maiorPopEstado + " - " + maiorPop);    
            }
            if (populacao.getValue().equals(menorPop)) {
                menorPopEstado = populacao.getKey();
                System.out.println("\nExiba o estado com o menor população e seu respectivo valor: " + menorPopEstado + " - " + menorPop);
            }
        }
        
        Iterator<Integer> iterator = popEstimada.values().iterator();

        int soma = 0;
        while(iterator.hasNext()) {
            soma += iterator.next();
        }

        System.out.println("\nExiba a soma da população desses estados: " + soma);

        System.out.println("\nExiba a média da população deste dicionário de estados: " + (soma/popEstimada.size()));

        System.out.println("\nRemova os estados com a população menor que 4.000.000:");
        Iterator<Integer> iterator2 = popEstimada.values().iterator();

        while(iterator2.hasNext()) {
            if(iterator2.next() < 4000000) {
                iterator2.remove();
            }
        }

        for (Map.Entry<String, Integer> entrys : popEstimada.entrySet()) {
            System.out.println(entrys.getKey() + " = " + entrys.getValue());
        }

        System.out.println("\nApague o dicionario de estados com suas respectivas populações estimadas");
        popEstimada.clear();
        System.out.println(popEstimada);

        System.out.println("Confira se a lista está vazia: " + popEstimada.isEmpty());
    }
}
