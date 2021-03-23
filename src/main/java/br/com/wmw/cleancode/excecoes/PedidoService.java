package br.com.wmw.cleancode.excecoes;

//TODO: Trocar a exceção checked por uma não checked (runtime)
//TODO: Usar uma exceção mais específica para a validação
public class PedidoService {

	public void validarPreco(final Double valor) throws Exception {
		if (valor < 0) {
			throw new Exception("Valor deve ser maior que zero");
		}
	}

}
