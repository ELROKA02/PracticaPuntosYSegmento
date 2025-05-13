package app;

public class Principal {

	/*
	 * Esta forma numero aleatorio entre 0 y 10
	 * int aleatorio = (int)Math.random()*10;
	 */
	// 1
	
	Punto p1 = new Punto (((int)Math.random()*10),((int)Math.random()*10));
	Punto p2 = new Punto (((int)Math.random()*10),((int)Math.random()*10));
	Punto p3 = new Punto (((int)Math.random()*10),((int)Math.random()*10));
	Punto p4 = new Punto (((int)Math.random()*10),((int)Math.random()*10));


	// 2
	
	Segmento s1 = new Segmento (p1,p2);
	Segmento s2 = new Segmento (p3,p4);
	
	// 3
	

}
