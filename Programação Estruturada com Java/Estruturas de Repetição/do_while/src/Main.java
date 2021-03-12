import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//DO WHILE
		
		//O LAÇO DO-WHILE DIVERGE DO LAÇO WHILE, POIS NESTE LAÇO É EXECUTADO INICIALMENTE UM BLOCO
		//DE COMANDO E EM SEGUIDA É REALIZADO A TRATATIVA DA CONDIÇÃO.
		
		Scanner sc = new Scanner(System.in);
		char choice;
		
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			
			double F = 9.0 * C/ 5.0 + 32.0;
			
			System.out.printf("Equivalente em Fahrenheint: %.1f%n", F);
			
			System.out.println("Deseja repetir a operação? (S/N):  ");
			choice = sc.next().charAt(0);
		} while(choice != 'n');
		
		sc.close();
	}

}
