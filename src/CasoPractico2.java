public class CasoPractico2 {

	public static void main(String[] args) {
		/*Diseñe un algoritmo que determine el área (A) de un rombo del que se conoce su 
		 *base mayor (B), su base menor (b) y su altura (h). Considere la siguiente fórmula:
		 * 
		 * A = (b + B) x h/2
		 * */
		
		
		int basemayor = 8;
		int basemenor = 10;
		int altura = 3;
		
		//Variable para el calculo del area del rombo
		int area = ((basemenor * basemayor) * altura)/2;
		
		//Imprimimos el resultado.
		
		System.out.println("Datos:\n" + "Base Mayor: " + basemayor + "\n" +
										"Base Menor: " + basemenor + "\n" +
										"Altura: " + altura +    "\n");
		
		System.out.println("El area de su rombo es: " + area);

	}

}
