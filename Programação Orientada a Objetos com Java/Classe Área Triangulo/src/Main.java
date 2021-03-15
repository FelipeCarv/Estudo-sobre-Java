import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Triangulo t1 = new Triangulo();
		
		System.out.println("Digite os valores do triangulo: ");
		
		Scanner sc = new Scanner(System.in);
		
		t1.x = sc.nextDouble();
		t1.y = sc.nextDouble();
		t1.z = sc.nextDouble();
		
		System.out.println("Área do triangulo: " + t1.areaTriangulo());
		
		sc.close();
	}

}
