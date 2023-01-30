import java.util.Scanner;

public class IndustriaDaMulta {

/* A prefeitura de uma cidade A instalou uma câmera para verificar quem estava acima da velocidade permitida na rodovia da entrada da cidade. Porém, ela é uma cidade extremamente movimentada e a prefeitura não deu conta de enviar as multas necessárias para quem ultrapassasse a velocidade permitida de 60km/h. O seu papel será o de criar um programa que verifique os dados recebidos da câmera e envie uma mensagem dizendo se o motorista será multado ou não.
 */

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();

        if(velocidadeAtual <= 60) {
            System.out.println("Nao foi multado");
        } else {
            System.out.println("Foi multado");
        }

        leitor.close();
    }
}
