package br.com.wmw.cleancode.nomenclaturas;

//TODO: Melhorar nomes dos atributos, parâmetros e variáveis 
public class ClienteService {

	private final ClienteRepository clienteRepository;

	public ClienteService(final ClienteRepository repository) {
		this.clienteRepository = repository;
	}

	public Cliente findCliente(final Cliente clienteFilter) {
		return this.clienteRepository.consultar(clienteFilter.getIdCliente());
	}

}
