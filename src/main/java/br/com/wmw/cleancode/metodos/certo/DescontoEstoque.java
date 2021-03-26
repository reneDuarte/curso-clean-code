package br.com.wmw.cleancode.metodos.certo;

public enum DescontoEstoque {

	FAIXA_UM(1000, 5);

	private int quantidadeMinima;
	private double desconto;

	DescontoEstoque(final int quantidadeMinima, final double desconto) {
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
