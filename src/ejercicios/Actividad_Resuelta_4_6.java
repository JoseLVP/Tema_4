package ejercicios;

import java.util.Scanner;

public class Actividad_Resuelta_4_6 {

	public static void main(String[] args) {
		
		
		System.out.print("Introduce un numero -> ");
		Scanner sc = new Scanner(System.in);
		int Numero = sc.nextInt();
		
		System.out.println("El Numero introducido -> [" +Numero+"] es Primo? " +Primo(Numero));

	}

	
	
	
	static boolean Primo(int Numero) {
		
		boolean Resultado=true;
		
		int i =2;
		
		if (Numero < 2) {
			Resultado=false;
		}
		
		while (i < Numero && Resultado == true) {
			if (Numero % i ==0) {
				Resultado=false;
			}
			i++;
		}
		
		
		return (Resultado);
	}
	
}
