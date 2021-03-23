package br.com.wmw.cleancode.nomenclaturas;

//TODO: Melhorar nomes dos atributos, métodos e variáveis
//TODO: Observar se há possibilidade de criar constantes para valores fixos
public class Circulo {

	/*
	 * Nome do atributo deve ser claro.
	 */
	private final Double r;

	/*
	 * Nome do parâmetro do construtor deve ser claro.
	 */
	public Circulo(final Double r) {
		this.r = r;
	}

	/*
	 * Nome do método deve representar o objetivo do método.
	 * O valor do PI deve ser uma constante.
	 */
	public double r() {
		return 3.14 * this.r * this.r;
	}

}
