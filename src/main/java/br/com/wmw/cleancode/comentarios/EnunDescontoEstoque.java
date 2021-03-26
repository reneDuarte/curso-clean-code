package br.com.wmw.cleancode.comentarios;

public enum EnunDescontoEstoque {
	E1000(1000, 5D);

	private final Integer estoque;
	private final Double desconto;

	EnunDescontoEstoque(Integer estoque, Double desconto) {
		this.estoque = estoque;
		this.desconto = desconto;
	}

	public static Double get(Integer estoque){
		if(estoque != null && estoque > 0){
			for (EnunDescontoEstoque value : EnunDescontoEstoque.values()) {
				if(estoque >= value.estoque){
					return value.desconto;
				}
			}
		}
		return 0D;
	}
}
