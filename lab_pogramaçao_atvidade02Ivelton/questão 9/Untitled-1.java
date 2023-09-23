
    
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GerenciadorDeArquivos {



    
    public static void lerArquivo(String nomeArquivo) {
        try {
            // Abre o arquivo para leitura
            FileReader fileReader = new FileReader(nomeArquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;

            // Lê e exibe cada linha do arquivo
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

            // Fecha o arquivo
            bufferedReader.close();
        } catch (IOException e) {
            // Trata exceções de leitura do arquivo
            System.err.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String nomeDoArquivo = "exemplo.txt"; // Substitua pelo nome do seu arquivo

        // Chama o método lerArquivo para exibir o conteúdo do arquivo
        lerArquivo(nomeDoArquivo);
    }
}

    



