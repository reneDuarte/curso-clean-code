package br.com.wmw.cleancode.excecoes.certo;

public class ArquivoNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ArquivoNaoEncontradoException(final String msg, final Throwable cause) {
		super(msg, cause);
	}

}