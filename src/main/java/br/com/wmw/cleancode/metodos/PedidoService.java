package br.com.wmw.cleancode.metodos;

import br.com.wmw.cleancode.comentarios.*;

//TODO: Reduzir a complexidade diminuindo o número de IFs aninhados
//TODO: Separar a responsabilidade de calcular o desconto da responsabilidade de executar o cálculo do desconto
public class PedidoService {

	public Double calcularDesconto(final Double valor, final Integer quantidade, final Integer estoque, final boolean descontoPorQuantidade, final boolean descontoPorEstoque) {
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
