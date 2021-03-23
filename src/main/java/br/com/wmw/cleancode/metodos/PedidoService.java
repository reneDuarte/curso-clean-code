package br.com.wmw.cleancode.metodos;

//TODO: Reduzir a complexidade diminuindo o número de IFs aninhados
//TODO: Separar a responsabilidade de calcular o desconto da responsabilidade de executar o cálculo do desconto
public class PedidoService {

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
