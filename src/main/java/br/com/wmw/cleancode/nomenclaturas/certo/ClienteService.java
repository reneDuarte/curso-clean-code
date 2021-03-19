package br.com.wmw.cleancode.nomenclaturas.certo;

public class ClienteService {

	/*
	 * Nome da propriedade clienteRepository ficou claro.
	 */
	private final ClienteRepository clienteRepository;

	/*
	 * Nome do parâmetro clienteRepository ficou claro.
	 */
	public ClienteService(final ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	/*
	 * Nome do parâmetro referente ao filtro de cliente ficou claro.
	 * Nome da variável referente ao cliente consultado ficou clara.
	 */
	public Cliente consultarCliente(final Cliente clienteFilter) {
		final Cliente clienteConsultado = this.clienteRepository.consultar(clienteFilter.getId());
		return clienteConsultado;
	}

}
