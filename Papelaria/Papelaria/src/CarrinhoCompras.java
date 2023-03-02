import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	public void adicionar(Produto item) {
		listaProdutos.add(item);
	}
	public List<Produto> gerarLista(){
		return this.listaProdutos;
	}
}
