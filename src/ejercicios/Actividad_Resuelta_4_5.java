package ejercicios;

import java.util.Scanner;

public class Actividad_Resuelta_4_5 {

	public static void main(String[] args) {
		
		
		System.out.println("Introduce una letra para Analizar -> ");
		Scanner sc = new Scanner(System.in);
		String Letra = sc.next();
		
		Vocal(Letra);

		System.out.println("La letra introducida -> " +Letra+ " Es una vocal? " +Vocal(Letra));
		
		sc.close();
	}

	
	
	
	static boolean Vocal(String Letra){
		
		boolean Resultado = false;
		
		if (Letra.equals("a")||Letra.equals("A") ||Letra.equals("e") ||Letra.equals("E")||Letra.equals("i")
			||Letra.equals("I") ||Letra.equals("o") ||Letra.equals("O")||Letra.equals("u") ||Letra.equals("U")) {
		
			Resultado = true;
		}
		
		
		return (Resultado);
	}
	
	
}
