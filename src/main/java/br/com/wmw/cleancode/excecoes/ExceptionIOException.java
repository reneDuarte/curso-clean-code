package br.com.wmw.cleancode.excecoes;

import java.io.IOException;

public class ExceptionIOException extends RuntimeException{
	public ExceptionIOException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
