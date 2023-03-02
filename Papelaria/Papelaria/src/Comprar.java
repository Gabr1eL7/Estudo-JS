import java.util.List;

import javax.swing.JOptionPane;

public class Comprar {

	public static void main(String[] args) {
		Caderno caderno1 = new Caderno();
		Caneta caneta1 = new Caneta();
		Agenda agenda1 = new Agenda();
		
		caderno1.inserirDados();
		caneta1.inserirDados();
		agenda1.inserirDados();
		
		CarrinhoCompras meuCarrinho = new CarrinhoCompras();
		meuCarrinho.adicionar(caderno1);
		meuCarrinho.adicionar(caneta1);
		meuCarrinho.adicionar(agenda1);
		
		List<Produto> minhaLista = meuCarrinho.gerarLista();
		
		double frete = 0;
		int km = Integer.parseInt(JOptionPane.showInputDialog("KM"));
		
		for(Produto produtos : minhaLista) {
			frete = frete + (km * 2);
			JOptionPane.showMessageDialog(null, produtos.toString());
		}
		
		JOptionPane.showMessageDialog(null, "R$ " + frete);

	}

}
