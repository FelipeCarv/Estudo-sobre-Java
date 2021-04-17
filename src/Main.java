import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Produto p1 = new Produto("TV", 1000, 10);
		Produto p2 = new Produto("Rádio", 200, 5);

		p2.setNome("Caixa de Som");
		p2.setPreco(500);

		System.out.println("------------------------------------ ");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		sc.close();

	}

}
