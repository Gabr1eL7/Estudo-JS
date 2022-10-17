import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

// ENCAPSULAMENTO
/* Encapsular os dados de uma aplica��o significa evitar
 * que estes sofram acessos indevidos.
 * 
 * Public / Private / Protected 
 * */
public class Atleta { 
	// Atleta.java (classe) representa um objeto
	// Atributos/Vari�veis s�o as caracter�sticas do objeto
	// Cria��o de atributos
	private int codigo;
	private String nome;
	private String esporte;
	private double valorPatrocinio;
	
	// Get e Set - M�todos acessores
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
	public String getEsporte() {
		return esporte;
	}
	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}
	public double getValorPatrocinio() {
		return valorPatrocinio;
	}
	public void setValorPatrocinio(double valorPatrocinio) {
		this.valorPatrocinio = valorPatrocinio;
	}
	
	public void inserirDados() {
		this.codigo = Integer.parseInt(JOptionPane.showInputDialog("C�digo"));
		this.nome = JOptionPane.showInputDialog("Nome");
		this.esporte = JOptionPane.showInputDialog("Esporte");
		this.valorPatrocinio = Double.parseDouble(JOptionPane.showInputDialog("Valor de Patroc�nio"));
	}
	
	public void mostrar() {
		String mensagem = "Objeto Atleta criado a partir da Classe atleta \n";
		mensagem += "\nC�digo: " + this.getCodigo();
		mensagem += "\nNome: " + this.getNome();
		mensagem += "\nEsporte: " + this.getEsporte();
		
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		
		mensagem += "\nValor de Patroc�nio: " + formatar.format(this.getValorPatrocinio());
		
		JOptionPane.showMessageDialog(null, mensagem);
	}
	public double atualizarValor(double taxa) {
		this.valorPatrocinio += this.valorPatrocinio*taxa / 100;
		return this.valorPatrocinio;
	}
}
