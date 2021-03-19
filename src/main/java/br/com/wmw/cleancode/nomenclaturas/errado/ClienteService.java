package br.com.wmw.cleancode.nomenclaturas.errado;

public class ClienteService {

	/*
	 * Nome do atributo repository deve ser melhor descrito.
	 */
	private final ClienteRepository repository;

	/*
	 * Nome do parâmetro repository deve ser melhor descrito.
	 */
	public ClienteService(final ClienteRepository repository) {
		this.repository = repository;
	}

	/*
	 * Nome do parâmetro e da variável de retorno são semelhantes, podendo gerar confusão.
	 */
	public Cliente findCliente(final Cliente cliente) {
		final Cliente cliente2 = this.repository.consultar(cliente.getId());
		return cliente2;
	}

}
