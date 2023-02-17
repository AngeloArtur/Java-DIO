import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class CheckedException {
    public static void main(String[] args) {
        String nomeDoArquivo = "romances_blake_crouch.txt";
        try {
            ImprimirArquivoConsole(nomeDoArquivo);
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Confira o nome do arquivo");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado");
            e.printStackTrace();
        }

        System.out.println("Apesar da exception ou não, o programa continua");
    }

    private static void ImprimirArquivoConsole(String nomeDoArquivo) throws IOException {
        File file  = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (line != null); 
        bw.flush();
        br.close();
    }
}
