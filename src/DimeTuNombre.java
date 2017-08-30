import java.util.Scanner;

public class DimeTuNombre {
	

	/**
	 * @param argumentos
	 */

	public static void main(String[] argumentos) {
		/**
		 * Ingresandos datos desde el teclado
		 */
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime tu nombre");
		String nombre = leer.nextLine();
		System.out.println("Hola "+ nombre + ", encantado de conocerte");
//		Solucion del Resource leak:leer is never closed, sin implementar try y catch.
		leer.close();
		
	}

}
