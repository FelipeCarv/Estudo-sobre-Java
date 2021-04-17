
public class Produto {
	private String nome;
	private double preco;
	private int quantidade;

	// Construtor
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	// metodos da classe
	public double valorTotalEstoque() {
		return preco * quantidade;
	}

	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return "Produto: " + getNome() + ", R$ " + getPreco() + ", " + quantidade + " uni." + " Valor Total: " + "R$ "
				+ valorTotalEstoque();
	}

	
	//Getters and Setters
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
}
