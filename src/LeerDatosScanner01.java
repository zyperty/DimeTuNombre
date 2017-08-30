import java.util.Scanner;

public class LeerDatosScanner01 {
	
	public static void main(String[] argumentos) {
		
/**		Al crear el objeto dato Eclipse marca un error
*		Resource leak: 'leer' is never closed - En https://stackoverflow.com proponen la solucion que implemente
*		y el uso de try y catch.
*/
		
	try(	Scanner dato = new Scanner(System.in);){
		
		System.out.println("Ingresa tu nombre");
		String nombre = dato.nextLine();
		System.out.println("Ingresa tu edad");
		
//		Convierte una cadena de caracteres en numero entero.
		int edad = Integer.parseInt(dato.nextLine());
		System.out.println("Tu nombre es  "+nombre+", y tu edad es "+edad);
		
//		Esta linea de codigo soluciona el error en Eclipse.
		dato.close();
	}
	catch(Exception ex ) {
		
		ex.printStackTrace();
	}
		
	}

}
