package clases;

public class Segmento {

	/**
	 * constructor del segmento para darle valores
	 * 
	 * @param x
	 * @param y
	 */
	public Segmento (Punto a,Punto b) {
		this.a = a;
		this.b = b;
		
	}
	
	/**
	 * Constructor del segmento sin valores por defecto a=(0,0) y b=(1,1)
	 * 
	 */
	public Segmento () {
		this.a = new Punto (0,0);
		this.b = new Punto (1,1);
		
	}
	
	/**
	 * metodo para calcular la distancia del segmento
	 * 
	 * @return la distancia en decimales
	 */
	public double distancia() {
		this.a
		double distancia = Math.sqrt(geta())
	}
	
	
	public void seta (Punto a) {
		this.a=a;
	}
	
	public void setb (Punto b) {
		this.b=b;
	}
	
	public double geta() {
		return this.a;
	}
		
	public double getb() {
		return this.b;
	}
	
	public String toString() {
		return "[" + this.a + "," + this.b + "]";
 	}
	
}
