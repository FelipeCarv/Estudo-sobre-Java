import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Switch Case
		
		/*ESSA ESTRUTURA É UTILIZADA QUANDO SE EXISTE DIVERSAS OPÇÕES DE ESCOLHAS PARA
		 *TRATAR DOS DADOS INSERIDOS. AO INVÉS DE USAR MUITOS IF-ELSE ENCADEADOS, PODEMOS
		 *FAZER USO DA ESTRUTURA SWITCH CASE.*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o dia de hoje? Digite um número de 1 a 7: ");
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 7) {
			
			String dia;
			
		switch(num) {
			case 1:
				dia = "domingo";
				break;
			case 2:
				dia = "segunda";
				break;
			case 3:
				dia = "terça";
				break;
			case 4:
				dia = "quarta";
				break;
			case 5:
				dia = "quinta";
				break;
			case 6:
				dia = "sexta";
				break;
			case 7:
				dia = "sábado";
				break;
			default: 
				dia = "esse dia da semana não existe";
				break;
			}
		System.out.println("Hoje é " + dia);
			
		} else {
			
			System.out.println("O número digitado não pertence a faixa de valores estabelecidos.");
		}
		
		sc.close();
	}

}
