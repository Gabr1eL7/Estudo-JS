import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class Cadastrar {
	
	private int codigo;
	private String nome;
	private double preco;

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
		
	public void inserirDados() {
		this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Código"));
		this.nome = JOptionPane.showInputDialog("Nome");
		this.preco = Double.parseDouble(JOptionPane.showInputDialog("Preço do produto"));
	}
	
	public void mostrarDados() {
		
		String mensagem = " Cadastramento do produto/serviço \n";
		
		mensagem += "\n Codigo: " + this.getCodigo();
		mensagem += "\n Nome: " + this.getNome();
		
        NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		
		mensagem += "\n Preço do produto: \n" + formatar.format(this.getPreco());
		
		JOptionPane.showMessageDialog(null, mensagem);
		
	}
	
	public double taxaLoja(double taxa) {
		
			this.preco += this.preco*taxa / 100;
			return this.preco;
	}

}
