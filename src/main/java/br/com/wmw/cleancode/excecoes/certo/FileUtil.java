package br.com.wmw.cleancode.excecoes.certo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileUtil {

	private FileUtil() {

	}

	/*
	 * Método retorna uma exceção unchecked (RuntimeExcpetion).
	 * Método dispara uma exceção específica em caso de erro.
	 * Nenhuma exceção é ignorada.
	 * Exceções são tratadas em pontos específicos e não de forma genérica.
	 * Pilha da exceção original é sempre propagada dentro da exceção unchecked.
	 * Não é feito printStackTrace e ignorada a exceção.
	 */
	public String loadFile(final String fileName) {
		final File fileToRead = new File(fileName);
		try {
			final InputStream inputStream = new FileInputStream(fileToRead);
			try {
				final StringBuilder conteudo = new StringBuilder();
				int data;
				while ((data = inputStream.read()) != -1) {
					conteudo.append((char) data);
				}
				return conteudo.toString();
			} finally {
				inputStream.close();
			}
		} catch (final FileNotFoundException e) {
			throw new ArquivoNaoEncontradoException(fileName, e);
		} catch (final IOException e) {
			throw new ErroAoLerArquivoException(fileName, e);
		}
	}

}
