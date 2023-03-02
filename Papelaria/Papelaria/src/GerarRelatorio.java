
public class GerarRelatorio {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.inserirDados();
		
		Relatorio relatorio1 = new Relatorio();
		relatorio1.setAno("2022");
		relatorio1.setMes("11");
		relatorio1.setProduto(produto1);

		System.out.println("Produto: " + relatorio1.getProduto().getDescricao());
		System.out.println("Mês: " + relatorio1.getMes());
		System.out.println("Ano: " + relatorio1.getAno());
		System.out.println("R$: " + relatorio1.getProduto().getPreco() * 31);
	}

}
