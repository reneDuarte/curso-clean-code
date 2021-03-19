package br.com.wmw.cleancode.excecoes.certo;

public class ErroAoLerArquivoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ErroAoLerArquivoException(final String msg, final Throwable cause) {
		super(msg, cause);
	}

}