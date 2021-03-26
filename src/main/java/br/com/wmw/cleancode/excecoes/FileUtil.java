package br.com.wmw.cleancode.excecoes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//TODO: Trocar as exceções checked por não checked (runtime)
//TODO: Usar uma exceções mais específicas para a validação
//TODO: Não retorna valores nulos em caso de erro
//TODO: Deixar claro o problema em caso de erro
//TODO: Evitar a captura de exceções muito genéricas
//TODO: Evitar o print de stack trace sem dar nenhum retorno sobre a exceção
public class FileUtil {

	private FileUtil() {

	}

	public static String loadFile(final String fileName) {
		final File fileToRead = new File(fileName);
		try (InputStream inputStream = getFileInputStream(fileToRead)) {
			final StringBuilder conteudo = new StringBuilder();

			int data;
			while ((data = inputStream.read()) != -1) {
				conteudo.append((char) data);
			}
			return conteudo.toString();
		} catch (IOException e) {
			throw new ExceptionIOException("Falha ao ler ou Fechar o arquivo", e);
		}
	}

	private static InputStream getFileInputStream(File fileToRead) {
		try {
			return new FileInputStream(fileToRead);
		} catch (FileNotFoundException e) {
			throw new ExceptioFileInputStream("Falha ao abrir o arquivo", e);
		}
	}

}
