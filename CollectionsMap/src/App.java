import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l

 1 -Crie um dicionário que relacione os modelos e seus respectivos consumos
 2 -Substitua o consumo do gol por 15,2 km/l
 3 - Confira se o modelo tucson está no dicionário
 4 - Exiba o consumo do uno
 5 - Exiba os modelos
 6 - Exiba os consumos
 7 - Exiba o modelo mais econômico e seu consumo
 8 - Exiba a soma dos consumos
 9 - Exiba a médida da soma dos consumos
 10 - Remova os modelos com o consumo igual a 15,6 km/l
 11 - Exiba todos os carros na ordem em que foram informados
 12 - Exiba o dicionário ordenado pelo modelo
 13 - Apague o dicionario de carros
 14 - Confira se o dicionário está vazio
 */


public class App {
    public static void main(String[] args) throws Exception {
        //Key e Valor
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos:");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares.toString());

        System.out.println("\nSubstitua o consumo do gol por 15,2 km/l");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.print("\nConfira se o modelo tucson está no dicionário: ");
        System.out.println(carrosPopulares.containsKey("tucson"));

        System.out.println("\nExiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("\nExiba os modelos: " + carrosPopulares.keySet());

        System.out.println("\nExiba os consumos: " + carrosPopulares.values());

        System.out.println("\nExiba o modelo mais econômico e seu consumo");
        double maxValor = Collections.max(carrosPopulares.values());    
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry : entries) {
            if(entry.getValue().equals(maxValor)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("modelo mais eficiente: " + modeloMaisEficiente + " seu consumo: " + maxValor);
            }
        }

        System.out.println("\nExiba o modelo menos econômico e seu consumo");
        double minValor = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries2 = carrosPopulares.entrySet();
        String modeloMenosEficiente = "";
        for (Map.Entry<String,Double> entry : entries2) {
            if(entry.getValue().equals(minValor)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("modelo menos eficiente: " + modeloMenosEficiente + " seu consumo: " + minValor);
            }
        }

        System.out.println("\nExiba a soma dos consumos:");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        double soma = 0d;

        while(iterator.hasNext()) {
          soma += iterator.next();
        }
        System.out.println(soma + "Km/L");

        System.out.println("\nExiba a médida da soma dos consumos: " + (soma/carrosPopulares.size()));

        System.out.println("\nRemova os modelos com o consumo igual a 15,6 km/l");

        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        while(iterator2.hasNext()){
            if(iterator2.next().equals(15.6)){
                iterator2.remove();
            }
        }
        System.out.println(carrosPopulares.toString());

        System.out.println("\nExiba todos os carros na ordem em que foram informados");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("\nExiba o dicionário ordenado pelo modelo:");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("\nApague o dicionario de carros: ");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o dicionário está vazio: " + carrosPopulares.isEmpty());

        
    }
}
