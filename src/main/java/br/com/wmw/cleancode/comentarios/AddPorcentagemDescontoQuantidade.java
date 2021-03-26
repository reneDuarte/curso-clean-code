package br.com.wmw.cleancode.comentarios;

public class AddPorcentagemDescontoQuantidade implements AddPorcentagemDescontoProduto {

	@Override
	public void addDesconto(Produto produto) {
		produto.setDesconto(EnunDescontoQuantidade.getDesconto(produto.getQuantidade()));
	}
}
