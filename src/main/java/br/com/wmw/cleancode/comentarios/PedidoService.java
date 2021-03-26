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
		setValorLiquidoPedido(pedido);
		return pedido.geValorLiquido();
	}

	private void addPorcentagemDesconto(Pedido pedido) {
		if (pedido.isDescontoPorQuantidade()) {
			new AddPorcentagemDescontoQuantidad().addDesconto(pedido);
		}
		if (pedido.isDescontoPorEstoque()) {
			new AddPorcentagemDescontoPorEstoque().addDesconto(pedido);
		}
	}

	private void setValorLiquidoPedido(Pedido pedido){
		pedido.seValorLiquido(execCalculaDesconto(pedido));
	}
	private Double  execCalculaDesconto(Pedido pedido){
		return pedido.getDesconto() * (1 + (pedido.getDesconto() / 100));
	}
}
