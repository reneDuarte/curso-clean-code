package br.com.wmw.cleancode.comentarios;

public class AddPorcentagemDescontoQuantidad implements AddPorcentagemDescontoPedido {

	@Override
	public void addDesconto(Pedido pedido) {
		Integer quantidade = pedido.getQuantidade();
		double desconto = 0D;
		//Se a quantidade for maior ou igual a cem dá um desconto de 20%
		if (quantidade >= 100) {
			desconto = 20D;
			//Se a quantidade for maior ou igual a cinquenta, dá um desconto de 10%
		} else if (quantidade >= 50) {
			desconto = 10D;
			//Se a quantidade for  maior ou igual a dez, dá um desconto de 5%
		} else if (quantidade >= 10) {
			desconto = 5D;
		}

		pedido.setDesconto(desconto);
	}
}
