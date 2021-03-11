package saida_de_dados;

public class Main {

	public static void main(String[] args) {
		
		//SAÍDA DE DADOS NO CONSOLE: System.out.print("");
		System.out.print("Olá!");
		
		//SAÍDA DE DADOS NO COSOLE COM QUEBRA DE LINHA:
		System.out.println("Bom dia!");
		
		//PARA IMPRIMIR O DADO DE UMA VARIÁVEL:
		int x = 10;
		System.out.println(x);
		
		//PARA IMPRIMIR UM VALOR EM PONTO FLUTUANTE:
		double y = 10.123654;
		System.out.printf("%.2f%n", y);
		
		//PARA CONCATENAR ELEMENTOS:
		int z = 2;
		System.out.println("Olá, me dê " + z + " Cafés, por favor!");
	}

}
