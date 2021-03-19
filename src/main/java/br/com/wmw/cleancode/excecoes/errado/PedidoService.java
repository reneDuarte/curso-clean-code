package br.com.wmw.cleancode.excecoes.errado;

public class PedidoService {

	/*
	 * Método dispara uma exceção checked (Exception)
	 * Método dispara uma exceção genérica
	 */
	public void validarPreco(final Double valor) throws Exception {
		if (valor < 0) {
			throw new Exception("Valor deve ser maior que zero");
		}
	}

}
