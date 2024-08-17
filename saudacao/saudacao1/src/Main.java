import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String nome = "Ângelo";
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        Locale brasil = new Locale("pt", "BR");
        String dia = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        String saudacao;
        LocalDateTime hora = LocalDateTime.now();
        if (hora.getHour() >= 6 && hora.getHour() <=12) {
            saudacao = "Bom dia";
        } else if (hora.getHour() >= 12 && hora.getHour() <= 18) {
            saudacao = "Boa tarde";
        } else if (hora.getHour() >= 18 && hora.getHour() <=24) {
            saudacao = "Boa noite";
        } else {
            saudacao = "";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s", nome, dia, saudacao);
    }
}