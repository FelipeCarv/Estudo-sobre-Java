package laco_for;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//LAÇO FOR
		
		//O LAÇO FOR É UMA ESTRUTURA DE REPETIÇÃO QUE REPETE UM COMANDO 'N' VEZES DENTRO DE UM 
		//INTERVALO ESTABELECIDO.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos números você deseja inserir: ");
		int x = sc.nextInt();
		
		int res = 0;
		
		for(int i = 0; i < x; i++) {
			
			System.out.print("Digite um número: ");
			res = res + sc.nextInt();
			
		}
		
		System.out.println("A Soma de todos os números digitados é: " + res);
		
		sc.close();
	}

}
