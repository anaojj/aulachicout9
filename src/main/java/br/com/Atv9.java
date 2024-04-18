package br.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Atv9 {
    public static void main(String[] args) {
        String file = "meuarquivo.txt";
        String palavraAlvo = "Javinha";
        int contador = 1;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] palavras = linha.split("\\s+"); // Divide a linha em palavras usando espaços como delimitador
                for (String palavra : palavras) {
                    if (palavra.equalsIgnoreCase(palavraAlvo)) {
                        contador++;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        System.out.println("A palavra 'Javinha' aparece " + contador + " vezes no arquivo.");
    }
}