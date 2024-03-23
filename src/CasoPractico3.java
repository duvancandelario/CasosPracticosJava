
public class CasoPractico3 {

	public static void main(String[] args) {
		/*Diseñe un algoritmo que determine el área (A) de un rombo del que se conoce
		 * su diagonal mayor (D) y su diagonal menor (d): Considere la formula:
		 * 
		 * 
		 * A = D x d / 2
		 * 
		 * */
		
		//Convertimos la formula en variables, declarando e inicializandola con valores
		
		int diagonalMayor = 6;
		int diagonalMenor = 3;
		
		int areaDelRombo = (diagonalMayor * diagonalMenor) / 2;

		System.out.println("Datos para hallar al area de un rombo:\n" +
								"Diagonal Mayor: " + diagonalMayor + "\n" +
								"Diagonal Menor: " + diagonalMenor + "\n\n"+
								
								"El area de su rombo es: " + areaDelRombo);
	}

}
