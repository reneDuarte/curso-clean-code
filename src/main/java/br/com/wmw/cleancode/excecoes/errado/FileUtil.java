package br.com.wmw.cleancode.excecoes.errado;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileUtil {

	private FileUtil() {

	}

	/*
	 * Método retorna um array de bytes vazio em caso de exceção.
	 * Exceções são ignoradas.
	 * Usuário não recebe qualquer feedback em caso de erro.
	 * É feita uma captura genérica para qualquer Exception.
	 * É feito um print de um stack sem dar nenhum retorno de uma exceção.
	 */
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
