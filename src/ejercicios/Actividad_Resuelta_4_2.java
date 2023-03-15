package ejercicios;

import java.util.Scanner;

public class Actividad_Resuelta_4_2 {

	public static void main(String[] args) {

		Ejercicio();

	}

	static void Ejercicio() {

		int Numero1, Numero2, Contador = 1;

		System.out.print("Introduce un Primer Numero -> ");
		Scanner sc = new Scanner(System.in);
		Numero1 = sc.nextInt();

		System.out.print("Introduce un Segundo Numero -> ");
		Numero2 = sc.nextInt();

		if (Numero1 > Numero2) {
			Orden1(Numero1, Numero2, Contador);
		}

		if (Numero2 > Numero1) {
			Orden2(Numero2, Numero1, Contador);
		}

	}

	static void Orden1(int Numero1, int Numero2, int Contador) {

		while (Numero1 >= Numero2) {
			if (Contador == 1) {
				System.out.print("Los numeros entre " + Numero1 + " y " + Numero2 + " son -> ");
			}
			System.out.print(Numero1 + " ");
			Contador++;
			Numero1--;
		}

	}

	static void Orden2(int Numero2, int Numero1, int Contador) {
		while (Numero2 >= Numero1) {
			if (Contador == 1) {
				System.out.print("Los numeros entre " + Numero1 + " y " + Numero2 + " son -> ");
			}
			System.out.print(Numero2 + " ");
			Contador++;
			Numero2--;
		}

	}
}
