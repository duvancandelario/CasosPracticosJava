public class CasoPractico1 {

	public static void main(String[] args) {
		/*Diseñe un algoritmo que determine el area (A) y el perimetro (P) de un rectangulo
		 * del que se conoce su base (b) y su altura (h). Considere las sgtes formulas:
		 * 
		 * 
		 * A = b x h
		 * P = 2 x (b + h)
		 * 
		 * */
		
		int base = 8;
		int altura = 10;
		
		//Variable para hallar el Area de un rectangulo.
		int area = base * altura;
		
		//Variable para hallar Perimetro de un rectangulo.
		int perimetro = 2 * (base + altura);
		
		System.out.println("La base de tu rectangulo es: " + base + " y la altura es: " + altura + "\n");
		System.out.println("El area de tu rectangulo es: " + area);
		System.out.println("El perimetro de tu rectangulo es: " + perimetro);

	}

}
