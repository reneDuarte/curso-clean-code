package br.com.wmw.cleancode.nomenclaturas;

//TODO: Melhorar nomes dos atributos, parâmetros e variáveis 
public class ClienteService {

	private final ClienteRepository repository;

	public ClienteService(final ClienteRepository repository) {
		this.repository = repository;
	}

	public Cliente findCliente(final Cliente cliente) {
		final Cliente cliente2 = this.repository.consultar(cliente.getId());
		return cliente2;
	}

}
