package br.com.wmw.cleancode.metodos.certo;

public class Produto {

	private Double valor;
	private Integer quantidade;
	private Integer estoque;

	public Double getValor() {
		return this.valor;
	}

	public void setValor(final Double valor) {
		this.valor = valor;
	}

	public Integer getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(final Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getEstoque() {
		return this.estoque;
	}

	public void setEstoque(final Integer estoque) {
		this.estoque = estoque;
	}

}
