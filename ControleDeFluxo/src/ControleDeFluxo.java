public class ControleDeFluxo {
    public static void main(String[] args) throws Exception {
        ifSemFlecha();
        ifMenor();
        switchSemana();
        switchNumero();
        switchFerias();
    }

    public static void ifSemFlecha() {
        int mes = 9;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês inválido");
        }
    }

    public static void ifMenor() {
        double salarioMensal = 1200.83;
        double mediaSalarial = 1250.20;

        int numeroDeDependentes = 4;
        int mediaDeDependentes = 2;

        boolean salarioBaixo = salarioMensal < mediaSalarial;
        boolean muitosDependentes = numeroDeDependentes >= mediaDeDependentes;

        boolean recebeAuxilio = salarioBaixo && muitosDependentes;

        if (recebeAuxilio){
            System.out.println("Funcionário deve receber auxílio");
        } else {
            System.out.println("Funcionário não deve receber auxílio");
        }
    }

    public static void switchSemana() {
        String dia= "Terça";
        switch (dia){
            case "Segunda": System.out.println(2);
             break;
            case "Terça": System.out.println(3);
             break;
            case "Quarta": System.out.println(4);
             break;
            case "Quinta": System.out.println(5);
             break;
            case "Sexta": System.out.println(6);
             break;
            case "Sábado": System.out.println(7);
             break;
            case "Domingo": System.out.println(1);
            default: System.out.println("Dia inválido");
             break;    
        }
    }

    public static void switchNumero() {
        int numero = 4;

        switch (numero) {
            case 1:
            case 2:
            case 3: System.out.println("certo");
            break;
            case 4: System.out.println("Errado");
            break;
            case 5: System.out.println("Talvez");
            break;
            default: System.out.println("Indefinido");
            break;
        }
    }

    public static void switchFerias() {
        String mes = "Janeiro";

        switch (mes){
            case "Janeiro":
            case "Julho":
            case "Dezembro": System.out.println("Férias");
            break;
            default: System.out.println("Não é férias");
            break;
        }
    }
}
