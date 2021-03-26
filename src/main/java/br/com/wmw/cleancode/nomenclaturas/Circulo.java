package br.com.wmw.cleancode.nomenclaturas;

//TODO: Melhorar nomes dos atributos, métodos e variáveis
//TODO: Observar se há possibilidade de criar constantes para valores fixos
public class Circulo {

	private final Double raio;

	public Circulo(final Double raio) {
		this.raio = raio;
	}

	public double getArea() {
		return Math.PI * getDiametro();
	}

	public Double getDiametro(){
		return (Math.pow(raio,2));
	}

}
