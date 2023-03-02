
public class TesteProdutoDataFabri {
	/* COMPOSI��O
	 * Revisando: Heran�a, Agrega��o, Composi��o
	 * 
	 * Pode-se dizer que a composi��o � uma varia��o da agrega��o.
	 * Uma composi��o tenta representar tamb�m um rela��o todo-parte.
	 * No entanto na composi��o o objeto pai (todo) � respons�vel
	 * por 'criar' e 'destruir' suas partes.
	 * Em um composi��o um mesmo objeto-parte n�o pode se associar a mais
	 * de em objeto-pai.
	 * */
	public static void main(String[] args) {
		DataFabricacao dtFabri = new DataFabricacao();
		dtFabri.setDia(07);
		dtFabri.setMes(11);
		dtFabri.setAno(2022);
		
		Produto produto1 = new Produto();
		produto1.setDescricao("Caneta Azul");
		produto1.setDataFabri(dtFabri);
		
		System.out.println("Produto: " + produto1.getDescricao());
		System.out.println("Data: " + produto1.getDataFabri().dataCompleta());

	}

}
