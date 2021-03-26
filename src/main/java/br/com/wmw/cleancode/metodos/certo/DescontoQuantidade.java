package br.com.wmw.cleancode.metodos.certo;

public enum DescontoQuantidade {

	FAIXA_UM(100, 20),
	FAIXA_DOIS(50, 10), 
	FAIXA_TRES(10, 5);

	private int quantidadeMinima;
	private double desconto;

	DescontoQuantidade(final int quantidadeMinima, final double desconto) {
		this.quantidadeMinima = quantidadeMinima;
		this.desconto = desconto;
	}

	public int getQuantidadeMinima() {
		return this.quantidadeMinima;
	}

	public double getDesconto() {
		return this.desconto;
	}

}
