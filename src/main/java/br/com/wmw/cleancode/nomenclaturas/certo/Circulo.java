package br.com.wmw.cleancode.nomenclaturas.certo;

public class Circulo {

	/*
	 * Nome do atributo ficou claro
	 */
	private final Double raio;

	/*
	 * Nome do parâmetro ficou claro
	 */
	public Circulo(final Double raio) {
		this.raio = raio;
	}

	/*
	 * Nome do método ficou claro
	 * Foi utilizada uma constante para o PI
	 */
	public double calcularArea() {
		return Math.PI * this.raio * this.raio;
	}

}
