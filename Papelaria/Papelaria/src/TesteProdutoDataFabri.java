
public class TesteProdutoDataFabri {
	/* COMPOSIÇÃO
	 * Revisando: Herança, Agregação, Composição
	 * 
	 * Pode-se dizer que a composição é uma variação da agregação.
	 * Uma composição tenta representar também um relação todo-parte.
	 * No entanto na composição o objeto pai (todo) é responsável
	 * por 'criar' e 'destruir' suas partes.
	 * Em um composição um mesmo objeto-parte não pode se associar a mais
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
