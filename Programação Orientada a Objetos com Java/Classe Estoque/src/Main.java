import java.util.Scanner;

import Produto.Produto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Produto p1 = new Produto();
		
		System.out.println("Entre com as informações do produto: ");
		
		System.out.print("Nome: ");
		p1.nome = sc.nextLine();
		
		System.out.print("Preço: ");
		p1.preco = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		p1.quantidade = sc.nextInt();
		
		
		System.out.println("------------------------------------ ");
		System.out.println(p1);
		sc.close();
	}

}
