package produto;

public class Produtos {
	public String nome;
	public double preco;
	public int quantidade;
	
	public Produtos(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
	}
	public double valorTotalNoEstoque() {
		return preco * quantidade;
	}
	public void adicioProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
		return nome + " $" + String.format("%.2f",preco) + " ," + quantidade + " Valor total dos produtos :$ " + String.format("%.2f", valorTotalNoEstoque());
		
	}


}
