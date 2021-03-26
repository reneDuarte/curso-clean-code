package br.com.wmw.cleancode.nomenclaturas;

//TODO: Melhorar nomes dos atributos, métodos e variáveis
//TODO: Observar se há possibilidade de criar constantes para valores fixos
public class Circulo {

	/*
	 * Nome do atributo deve ser claro.
	 */
	private final Double raio;

	/*
	 * Nome do parâmetro do construtor deve ser claro.
	 */
	public Circulo(final Double raio) {
		this.raio = raio;
	}

	/*
	 * Nome do método deve representar o objetivo do método.
	 * O valor do PI deve ser uma constante.
	 */
	public double getArea() {
		return Math.PI * getDiametro();
	}

	public Double getDiametro(){
		return (2 * this.raio);
	}

}
