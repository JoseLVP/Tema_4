package ejercicios;

import java.util.Scanner;

	

public class Actividad_Resuelta_4_9 {
	
	static int Max;
	static int Max2;
	static int Max3;

	public static void main(String[] args) {
		
		System.out.println("Vamos a comparar 3 numeros para saber cual es el mayor entre ellos -> ");
		System.out.print("Introduce el Primer Numero -> ");
		Scanner sc = new Scanner(System.in);
		int Numero1 = sc.nextInt();
		
		System.out.print("Introduce el Segundo Numero -> ");
		int Numero2 = sc.nextInt();
		
		System.out.print("Introduce el Tercer Numero -> ");
		int Numero3 = sc.nextInt();
		
		
		
		Max2=Comparacion1(Numero1, Numero2);
		
		
		
		Max3=Comparacion1(Max2,Numero3);
		
		System.out.println("El numero mayor entre los 3 es -> "+Max3);
		
	}

	static int Comparacion1(int Numero1, int Numero2) {
		
		
		if (Numero1 > Numero2) {
			
			Max=Numero1;
			return Max;
		}
		
		if (Numero2 > Numero1) {
			
			Max=Numero2;
			return Max;
		}
		
		return Max;
	}
	


	
}
