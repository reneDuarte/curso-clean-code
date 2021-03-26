package br.com.wmw.cleancode.comentarios;

public class AddPorcentagemDescontoPorEstoque implements AddPorcentagemDescontoProduto {
	@Override
	public void addDesconto(Produto produto) {
		produto.setDesconto(produto.getDesconto() + EnunDescontoEstoque.getDesconto(produto.getEstoque()));
	}
}
