public class Parcelas {
    public static void emprestimo (double valor, int parcelas) {
        if(parcelas == 2) {
            double resultado = valor + (valor*0.15);
            System.out.println("Em duas parcelas o valor final ficará: " + resultado);
        } else if (parcelas == 3) {
            double resultado = valor + (valor*0.20);
            System.out.println("Em três parcelas o valor final ficará: " + resultado);            
        } else System.out.println("Só são aceitas até 3 parcelas");
    } 
}
