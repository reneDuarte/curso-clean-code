package br.com.wmw.cleancode.comentarios.errado;

/*
 * Javadoc agrega pouco na descrição do método
 */
public class PedidoService {

	/**
	 * Calcula o desconto.
	 *
	 * @param valor Valor.
	 * @param quantidade Quantidade.
	 * @param estoque Estoque.
	 * @param descontoPorEstoque Aplica desconto por estoque
	 * @param descontoPorQuantidade Aplica desconto por quantidade
	 * @return Valor com o desconto.
	 */
	public Double calcularDesconto(final Double valor, final Integer quantidade, final Integer estoque, final boolean descontoPorEstoque, final boolean descontoPorQuantidade) {
		Double desconto = 0D;

		//Calcula o desconto pela quantidade
		if (descontoPorQuantidade) {
			//Se a quantidade for maior ou igual a cem dá um desconto de 30%
			if (quantidade >= 100) {
				desconto = 20D;
				//Se a quantidade for maior ou igual a cinquenta, dá um desconto de 15%
			} else if (quantidade >= 50) {
				desconto = 10D;
				//Se a quantidade for  maior ou igual a dez, dá um desconto de 10%
			} else if (quantidade >= 10) {
				desconto = 5D;
			}
		}

		//Se tiver desconto por estoque, verifica a quantidade e calcula o desconto
		if (descontoPorEstoque && (estoque > 1000)) {
			desconto = desconto + 5D;
		}

		//Retorna o valor do produto com o desconto
		return valor * (1 + (desconto / 100));
	}

}
