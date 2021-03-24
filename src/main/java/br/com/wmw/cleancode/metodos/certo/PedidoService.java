package br.com.wmw.cleancode.metodos.certo;

/*
 * Cada método tem uma única responsabilidade.
 * Métodos ficaram menores.
 * Apenas uma condição aninhada.
 * Não tem flags como parâmetros.
 * Não tem muitos parâmetros em cada método.
 */
public class PedidoService {

	private Double calculaDescontoPorQuantidade(final Integer quantidade) {
		if (quantidade >= 100) {
			return 20D;
		} else if (quantidade >= 50) {
			return 10D;
		} else if (quantidade >= 10) {
			return 5D;
		} else {
			return 0D;
		}
	}

	private Double calculaDescontoPorEstoque(final Integer estoque) {
		if (estoque > 1000) {
			return 5D;
		} else {
			return 0D;
		}
	}

	private Double calculaDescontoSobreValor(final Double valor, final Double desconto) {
		return valor * (1 + (desconto / 100));
	}

	public Double calcularDesconto(final Produto produto, final ConfigPedido configPedido) {
		double desconto = 0;
		if (configPedido.isUsaDescontoPorQuantidade()) {
			desconto = desconto + calculaDescontoPorQuantidade(produto.getQuantidade());
		}
		if (configPedido.isUsaDescontoPorEstoque()) {
			desconto = desconto + calculaDescontoPorEstoque(produto.getEstoque());
		}

		return calculaDescontoSobreValor(produto.getValor(), desconto);
	}

}
