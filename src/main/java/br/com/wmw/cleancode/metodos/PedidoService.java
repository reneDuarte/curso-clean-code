package br.com.wmw.cleancode.metodos;

import br.com.wmw.cleancode.comentarios.*;

//TODO: Reduzir a complexidade diminuindo o número de IFs aninhados
//TODO: Separar a responsabilidade de calcular o desconto da responsabilidade de executar o cálculo do desconto
public class PedidoService {

	public Double calcularDesconto(final Double valor, final Integer quantidade, final Integer estoque, final boolean descontoPorQuantidade, final boolean descontoPorEstoque) {
		Produto produto = new Produto();
		produto.setValor(valor);
		produto.setQuantidade(quantidade);
		produto.setEstoque(estoque);
		produto.setDescontoPorEstoque(descontoPorEstoque);
		produto.setDescontoPorQuantidade(descontoPorQuantidade);

		addPorcentagemDesconto(produto);
		setValorLiquidoPedido(produto);
		return produto.geValorLiquido();
	}

	private void addPorcentagemDesconto(Produto produto) {
		if (produto.isDescontoPorQuantidade()) {
			new AddPorcentagemDescontoQuantidade().addDesconto(produto);
		}
		if (produto.isDescontoPorEstoque()) {
			new AddPorcentagemDescontoPorEstoque().addDesconto(produto);
		}
	}

	private void setValorLiquidoPedido(Produto produto){
		produto.seValorLiquido(execCalculaDesconto(produto));
	}
	private Double  execCalculaDesconto(Produto produto){
		return produto.getDesconto() * (1 + (produto.getDesconto() / 100));
	}
}
