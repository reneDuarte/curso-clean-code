package br.com.wmw.cleancode.comentarios;

public class AddPorcentagemDescontoQuantidad implements AddPorcentagemDescontoPedido {

	@Override
	public void addDesconto(Pedido pedido) {
		pedido.setDesconto(EnunDescontoQuantidade.get(pedido.getQuantidade()));
	}
}
