
public class Triangulo {
	public double x;
	public double y;
	public double z;
	
	public double areaTriangulo() {
		
		double p = (x + y + z) / 2.0;
		double res = Math.sqrt(p * (p - x) * (p - y) * (p - z));
		
		return res;
	}
}
