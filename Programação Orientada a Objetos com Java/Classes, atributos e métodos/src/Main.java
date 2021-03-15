import Caneta.Caneta;

public class Main {
	
	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		
		c1.cor = "Azul";
		c1.marca = "BIC_Cristal";
		c1.ponta = 0.7;
		c1.tampa = true;
		
		System.out.println("Cor da caneta: " + c1.cor);
		System.out.println("Marca da caneta: " + c1.marca);
		System.out.println("Ponta da caneta: " + c1.ponta);
		System.out.println("Está tampada?: " + c1.tampa);
	}
	
}
