package br.com.wmw.cleancode.comentarios;

public class Pedido {
	private Double desconto = 0D;
	private Double valor;
	private Integer quantidade;
	private Integer estoque;
	private boolean descontoPorEstoque;
	private boolean descontoPorQuantidade;
	private Double valorLiquido;

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	public boolean isDescontoPorEstoque() {
		return descontoPorEstoque;
	}

	public void setDescontoPorEstoque(boolean descontoPorEstoque) {
		this.descontoPorEstoque = descontoPorEstoque;
	}

	public boolean isDescontoPorQuantidade() {
		return descontoPorQuantidade;
	}

	public void setDescontoPorQuantidade(boolean descontoPorQuantidade) {
		this.descontoPorQuantidade = descontoPorQuantidade;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void seValorLiquido(Double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

	public Double geValorLiquido() {
		return this.valorLiquido;
	}
}
