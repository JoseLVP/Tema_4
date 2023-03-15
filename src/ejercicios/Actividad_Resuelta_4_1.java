package ejercicios;

import java.util.Scanner;

public class Actividad_Resuelta_4_1 {

	public static void main(String[] args) {
		
		System.out.println("Introduce el numero de veces que queremos repetir la funcion");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i<=(N-1); i++) {
			eco();
		}

	}

	static void eco(){
		System.out.println("Eco...");
	}
}
