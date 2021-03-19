package br.com.wmw.cleancode.metodos.errado;

public class PedidoService {

	/*
	 * Várias condições aninhadas.
	 * O método tem mais de uma responsabilidade: determinar qual o desconto e aplicar o desconto ao valor.
	 */
	public Double calcularDesconto(final Double valor, final Integer quantidade, final Integer estoque, final boolean descontoPorQuantidade, final boolean descontoPorEstoque) {
		Double desconto = 0D;
		if (descontoPorQuantidade) {
			if (quantidade >= 100) {
				desconto = 20D;
			} else if (quantidade >= 50) {
				desconto = 10D;
			} else if (quantidade >= 10) {
				desconto = 5D;
			}
		}

		if (descontoPorEstoque && (estoque > 1000)) {
			desconto = desconto + 5D;
		}

		return valor * (1 + (desconto / 100));
	}

}
