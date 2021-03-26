package br.com.wmw.cleancode.comentarios;

public enum EnunDescontoQuantidade {

	Q100(20D , 100),
	Q50( 10D , 50),
	Q10( 5D, 10);

	private final Double desconto;
	private final Integer qt;

	EnunDescontoQuantidade(Double desconto , Integer qt){
		this.desconto = desconto;
		this.qt = qt;
	}

	public static Double get(Integer qt){
		if(qt == null || qt == 0){
			return 0D;
		}
		for (EnunDescontoQuantidade value : EnunDescontoQuantidade.values()) {
			if(qt >= value.qt){
				return value.desconto;
			}
		}
		return 0D;
	}
}
