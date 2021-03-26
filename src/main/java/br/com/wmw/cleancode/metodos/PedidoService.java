package br.com.wmw.cleancode.metodos;

import br.com.wmw.cleancode.comentarios.EnunDescontoEstoque;
import br.com.wmw.cleancode.comentarios.EnunDescontoQuantidade;

//TODO: Reduzir a complexidade diminuindo o número de IFs aninhados
//TODO: Separar a responsabilidade de calcular o desconto da responsabilidade de executar o cálculo do desconto
public class PedidoService {

	public Double calcularDesconto(final Double valor, final Integer quantidade, final Integer estoque, final boolean descontoPorQuantidade, final boolean descontoPorEstoque) {
		Double desconto = 0D;
		if (descontoPorQuantidade) {
			desconto += EnunDescontoQuantidade.get(quantidade);
		}
		if (descontoPorEstoque) {
			desconto += EnunDescontoEstoque.get(estoque);
		}
		return execCalculo(valor , desconto);
	}

	private Double execCalculo(final Double valor,final Double desconto){
		return valor * (1 + (desconto / 100));
	}

}
