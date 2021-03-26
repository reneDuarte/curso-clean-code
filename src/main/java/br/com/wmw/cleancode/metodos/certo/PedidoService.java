package br.com.wmw.cleancode.metodos.certo;

/*
 * Cada método tem uma única responsabilidade.
 * Métodos ficaram menores.
 * Apenas uma condição aninhada.
 * Não tem flags como parâmetros.
 * Não tem muitos parâmetros em cada método.
 */
public class PedidoService {

	private double calcularDescontoPorQuantidade(final Integer quantidade) {
		if (quantidade >= DescontoQuantidade.FAIXA_UM.getQuantidadeMinima()) {
			return DescontoQuantidade.FAIXA_UM.getDesconto();
		} else if (quantidade >= DescontoQuantidade.FAIXA_DOIS.getQuantidadeMinima()) {
			return DescontoQuantidade.FAIXA_DOIS.getDesconto();
		} else if (quantidade >= DescontoQuantidade.FAIXA_TRES.getQuantidadeMinima()) {
			return DescontoQuantidade.FAIXA_TRES.getDesconto();
		}
		return 0;
	}

	private double calculaDescontoPorEstoque(final Integer estoque) {
		if (estoque > DescontoEstoque.FAIXA_UM.getQuantidadeMinima()) {
			return DescontoEstoque.FAIXA_UM.getDesconto();
		}
		return 0;
	}

	private double calculaDescontoSobreValor(final Double valor, final Double desconto) {
		return valor * (1 + (desconto / 100));
	}

	public Double calcularDescontoProduto(final Produto produto, final ConfigPedido configPedido) {
		double descontoTotal = 0;

		if (configPedido.isUsaDescontoPorQuantidade()) {
			descontoTotal += calcularDescontoPorQuantidade(produto.getQuantidade());
		}

		if (configPedido.isUsaDescontoPorEstoque()) {
			descontoTotal += calculaDescontoPorEstoque(produto.getEstoque());
		}

		return calculaDescontoSobreValor(produto.getValor(), descontoTotal);
	}

}
