
public class MainLoja {

	public static void main(String[] args) {
		
		Jogos Jogo1 = new Jogos();
		
		Jogo1.setCodigo(789123);
		Jogo1.setPreco(50);
		Jogo1.setNome("Metal Slug");
		
		System.out.println(Jogo1.getNome() + " custa " + Jogo1.getPreco()+ " e seu código é " + Jogo1.getCodigo());
		
		
		Assistencia Limpeza = new Assistencia();
		
		Limpeza.setTipoServico("Limpeza");
		Limpeza.setPreco(60);
		Limpeza.taxaLoja(10); //Toda assistencia realizado na loja tem um custo de 10% 
		
		System.out.println("O custo para o serviço" + Limpeza.getTipoServico() + " é " + Limpeza.getPreco() + "* já aplicada 10% de taxa");
		
		System.out.println("O total é de: " + (Jogo1.getPreco() + Limpeza.getPreco()));
	}

}
