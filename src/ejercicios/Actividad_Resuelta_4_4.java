package ejercicios;

import java.util.Scanner;

public class Actividad_Resuelta_4_4 {

	

	public static void main(String[] args) {
		
		
		System.out.println("Introduzca un Numero -> ");
		Scanner sc = new Scanner(System.in);
		int Numero1 = sc.nextInt();
		
		System.out.println("Introduce un Segundo Numero -> ");
		int Numero2 = sc.nextInt();
			
		System.out.println("El numero mayor entre ambos numeros es -> " +Comparacion(Numero1, Numero2));
		
	}

	static int Comparacion(int Numero1, int Numero2) {
		
		int Max=0;
		
		if (Numero1 > Numero2) {
			
			Max = Numero1;	
		}
		
		if (Numero2 > Numero1) {
			Max = Numero2;
		}
		
		return (Max);
	}
	
	
}
