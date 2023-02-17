import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class CustomerExecption {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        ImprimirArquivoConsole(nomeDoArquivo);
        System.out.println("\nCom exception ou não, o programa continua...");
    }

    private static void ImprimirArquivoConsole(String nomeDoArquivo) {
    
        try{
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null); 
            bw.flush();
            br.close();
        } catch (ImpossivelAbrirArquivoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado, falar com o suporte" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static BufferedReader lerArquivo(String nomeArquivo) throws ImpossivelAbrirArquivoException {
        File file = new File(nomeArquivo);
        try {
            return new BufferedReader(new FileReader(nomeArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAbrirArquivoException(file.getName(), file.getPath());
        }
    }
}


class ImpossivelAbrirArquivoException extends Exception {

    private String nomeArquivo;
    private String diretorio;
    
    public ImpossivelAbrirArquivoException(String nomeArquivo, String diretorio) {
        super("O Arquivo " + nomeArquivo + " não foi encontrado no diretório " + diretorio);
        this.nomeArquivo = nomeArquivo;
        this.diretorio = diretorio;
    }
    
    @Override
    public String toString() {
        return "ImpossivelAbrirArquivoException [nomeArquivo=" + nomeArquivo + ", diretorio=" + diretorio + "]";
    }
}