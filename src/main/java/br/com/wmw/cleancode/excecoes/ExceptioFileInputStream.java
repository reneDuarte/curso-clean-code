package br.com.wmw.cleancode.excecoes;

import java.io.FileNotFoundException;

public class ExceptioFileInputStream extends RuntimeException{
	public ExceptioFileInputStream(String falha_ao_abrir_o_arquivo, Throwable cause) {
		super(cause);
	}
}
