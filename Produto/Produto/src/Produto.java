import javax.swing.JOptionPane;

public class Produto {
	
	private int codigo;
	private int numero;
	private String fabricante;
	private String nome;
	private String descricao;
	private double custo;
	private int estoque;
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrição() {
		return descricao;
	}
	public void setDescrição(String descrição) {
		this.descricao = descrição;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public void inserirDadosProdutos() {
	
	this.codigo=
			Integer.parseInt(JOptionPane.showInputDialog("Código"));
	this.numero=
			Integer.parseInt(JOptionPane.showInputDialog("Numero"));
	this.fabricante = JOptionPane.showInputDialog("Fabricante");
	this.nome = JOptionPane.showInputDialog("Nome");
	this.descricao = JOptionPane.showInputDialog("Descrição");
	this.custo = Double.parseDouble(JOptionPane.showInputDialog("Custo"));
	this.estoque=
			Integer.parseInt(JOptionPane.showInputDialog("Estoque"));
	}
	
	public void mostrar() {
		String mensagem = "Objeto Produto criado a partir da classe produto";
		mensagem += "\nCodigo: " + this.getClass();
		mensagem += "\nNumero: " + this.getNumero();
		mensagem += "\nFabricante: " + this.getFabricante();
		mensagem += "\nNome: " + this.getNome();
		mensagem += "\nDescrição: " + this.getDescrição();
		mensagem += "\nCusto: " + this.getCusto();
		mensagem += "\nEstoque: " + this.getEstoque();
		
		
	}
}
