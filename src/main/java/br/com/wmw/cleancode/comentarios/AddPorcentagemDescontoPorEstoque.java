package br.com.wmw.cleancode.comentarios;

public class AddPorcentagemDescontoPorEstoque implements AddPorcentagemDescontoPedido {
	@Override
	public void addDesconto(Pedido pedido) {
		pedido.setDesconto(pedido.getDesconto() + EnunDescontoEstoque.get(pedido.getEstoque()));
	}
}
