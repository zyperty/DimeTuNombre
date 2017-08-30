import java.util.Scanner;

public class NumerosPares {
	public static void main(String[] argumentos) {
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingresar un numero ");
		int numero = Integer.parseInt(dato.nextLine());
		dato.close();
		for(int i = 1; i <= numero; i++) {
			if (i%2 == 0) {
				System.out.println("Los numeros pares son "+i);
			}
		}
	}
}
