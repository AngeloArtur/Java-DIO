import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/* Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class TemperaturaMedia {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> temperatura = new ArrayList<>();
        Double valorTemperatura;
        
        for(int i = 0; i < 6; i++) {
            System.out.print("Digite uma temperatura: ");
            valorTemperatura = scan.nextDouble();
            temperatura.add(valorTemperatura);
        }

        System.out.println(temperatura);

        double soma;
        soma = temperatura.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Soma das temperaturas: " + soma);

        double media = soma/temperatura.size();
        System.out.println("Média das temperaturas: " + media);

        Iterator<Double> iterator = temperatura.iterator();

        int count = 0;
        System.out.println("Meses acima da média:");
        while(iterator.hasNext()){
            double maiorQueMedia = iterator.next();
            if (maiorQueMedia > media) {
                switch (count) {
                    case (0):
                    System.out.println((count+1) + " - Janeiro: " + maiorQueMedia + "°C");
                    break;
                    case (1):
                    System.out.println((count+1) + " - Fevereiro: " + maiorQueMedia + "°C");
                    break;
                    case (2):
                    System.out.println((count+1) + " - Março: " + maiorQueMedia + "°C");
                    break;
                    case (3):
                    System.out.println((count+1) + " - Abril: " + maiorQueMedia + "°C");
                    break;
                    case (4):
                    System.out.println((count+1) + " - Maio: " + maiorQueMedia + "°C");
                    break;
                    case (6):
                    System.out.println((count+1) + " - Junho: " + maiorQueMedia + "°C");
                    break;
                    default: System.out.println("Não houve nenhum mês acima da média"); 
                    break; 
                }
            }
            count++;
        }

        scan.close();
    }
}

