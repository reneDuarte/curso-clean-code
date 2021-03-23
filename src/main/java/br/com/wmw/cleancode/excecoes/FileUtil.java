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

	public String loadFile(final String fileName) throws FileNotFoundException {
		final File fileToRead = new File(fileName);
		final InputStream inputStream = new FileInputStream(fileToRead);
		try {
			final StringBuilder conteudo = new StringBuilder();

			int data;
			while ((data = inputStream.read()) != -1) {
				conteudo.append((char) data);
			}

			return conteudo.toString();
		} catch (final Exception e) {
			return null;
		} finally {
			try {
				inputStream.close();
			} catch (final IOException e) {
				e.printStackTrace();
			}
		}
	}

}
