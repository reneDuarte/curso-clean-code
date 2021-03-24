package br.com.wmw.cleancode.metodos.certo;

public class ConfigPedido {

	private boolean usaDescontoPorQuantidade;
	private boolean usaDescontoPorEstoque;

	public boolean isUsaDescontoPorQuantidade() {
		return this.usaDescontoPorQuantidade;
	}

	public void setUsaDescontoPorQuantidade(final boolean usaDescontoPorQuantidade) {
		this.usaDescontoPorQuantidade = usaDescontoPorQuantidade;
	}

	public boolean isUsaDescontoPorEstoque() {
		return this.usaDescontoPorEstoque;
	}

	public void setUsaDescontoPorEstoque(final boolean usaDescontoPorEstoque) {
		this.usaDescontoPorEstoque = usaDescontoPorEstoque;
	}

}
