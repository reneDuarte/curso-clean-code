package br.com.wmw.cleancode.comentarios;

//TODO: Extrair as lógicas descritas nos comentários para métodos, desta forma o código fica mais claro e organizado
//TODO: Remover comentários/javadoc que agregam pouco valor
public class PedidoService {

	public Double calcularDesconto(final Double valor, final Integer quantidade, final Integer estoque, final boolean descontoPorEstoque, final boolean descontoPorQuantidade) {

		Pedido pedido = new Pedido();
		pedido.setValor(valor);
		pedido.setQuantidade(quantidade);
		pedido.setEstoque(estoque);
		pedido.setDescontoPorEstoque(descontoPorEstoque);
		pedido.setDescontoPorQuantidade(descontoPorQuantidade);

		addPorcentagemDesconto(pedido);

		//Retorna o valor do produto com o desconto
		calculaDesconto(pedido);
		return pedido.geValorLiquido();
	}

	private void addPorcentagemDesconto(Pedido pedido) {
		//Calcula o desconto pela quantidade
		if (pedido.isDescontoPorQuantidade()) {
			new AddPorcentagemDescontoQuantidad().addDesconto(pedido);
		}
		//Se tiver desconto por estoque, verifica a quantidade e calcula o desconto
		if (pedido.isDescontoPorEstoque()) {
			new AddPorcentagemDescontoPorEstoque().addDesconto(pedido);
		}
	}

	private void calculaDesconto(Pedido pedido){
		Double valorLiquido = pedido.getDesconto() * (1 + (pedido.getDesconto() / 100));
		pedido.seValorLiquido(valorLiquido);
	}
}
