package br.com.wmw.cleancode.comentarios.certo;

/*
 * Javadoc foi removido pois só é útil em APIs e quando for utilizado deve ser bem elaborado.
 * Comentários foram removidos e foram utilizados métodos com nomes significativos.
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

	public Double calcularDesconto(final Double valor, final Integer quantidade, final Integer estoque, final boolean descontoPorQuantidade, final boolean descontoPorEstoque) {
		Double desconto = 0D;
		if (descontoPorQuantidade) {
			desconto = desconto + calculaDescontoPorQuantidade(quantidade);
		}
		if (descontoPorEstoque) {
			desconto = desconto + calculaDescontoPorEstoque(estoque);
		}

		return calculaDescontoSobreValor(valor, desconto);
	}

}
