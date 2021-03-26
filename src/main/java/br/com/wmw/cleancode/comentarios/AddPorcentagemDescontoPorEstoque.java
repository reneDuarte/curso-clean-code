package br.com.wmw.cleancode.comentarios;

public class AddPorcentagemDescontoPorEstoque implements AddPorcentagemDescontoPedido {
	@Override
	public void addDesconto(Pedido pedido) {
		if ((pedido.getEstoque() > 1000)) {
			Double desconto = pedido.getDesconto();
			pedido.setDesconto(desconto + 5D);
		}
	}
}
