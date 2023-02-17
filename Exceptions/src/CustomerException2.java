import javax.swing.JOptionPane;

public class CustomerException2 {
    public static void main(String[] args) {
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for(int i = 0; i < denominador.length; i++) {

            try {
                if(numerador[i]%2 != 0) {
                    throw new DivisaoNaoExataException("Divisão não exata!", numerador[i], denominador[i]);
                }
                double resultado = numerador[i]/denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Impossível dividir por 0");
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "O indice de denominadores é maior que o de numeradores");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado, entre em contato com o administrador");
                e.printStackTrace();
            }
        }
        System.out.println("O programa continua...");
    }
}

class DivisaoNaoExataException extends Exception {

    private int numerador;
    private int denominador;
    
    public DivisaoNaoExataException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    } 
}
