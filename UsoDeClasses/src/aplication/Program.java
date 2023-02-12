package aplication;

import java.util.Scanner;
import java.util.Locale;
import produto.Produtos;

public class Program {
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("Insira os dados do produto:");
		System.out.println("Nome :");
		String nome = sc.nextLine();
		
		System.out.println("Insira o preco dos produtos:");
		double preco = sc.nextDouble();
		
		System.out.println("Insira a quantidade em estoque dos produtos:");
		int quantidade = sc.nextInt();
		Produtos produtos = new Produtos(nome,preco,quantidade);
		
		System.out.println(" ");
		System.out.println("Os dados dos produto sao: " + produtos);
		
		System.out.println("Qual quantidade voce quer adicionar?: ");
		quantidade = sc.nextInt();
		produtos.adicioProdutos(quantidade);
		
		System.out.println(" ");
		System.out.println("Dados atualizados: " + produtos);
		
		System.out.println("Qual quantidade voce quer remover? :");
		quantidade = sc.nextInt();
		produtos.removProdutos(quantidade);
		
		System.out.println(" ");
		System.out.println("Dados atualizados : " + produtos);
		
		sc.close();
	}

}
