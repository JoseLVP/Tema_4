package ejercicios;

import java.util.Scanner;


public class Actividad_Resuelta_4_8 {

	public static void main(String[] args) {

		MenuPrincipal();

	}

	static void MenuPrincipal() {
		System.out.println();
		System.out.println("Introduce un Numero -> ");
		Scanner sc = new Scanner(System.in);
		double Numero1 = sc.nextDouble();

		System.out.println("Introduce un Segundo Numero -> ");
		double Numero2 = sc.nextDouble();

		System.out.println(
				"Introduce un valor para realizar la Operacion ->  \n -> Sumar [Seleccione 1]\n -> Restar [Seleccione 2]\n -> Multiplicar [Seleccione 3]\n -> Dividir [Seleccione 4]\n -> Raiz Cuadrada [Seleccione 5]\n -> Exponencial [Seleccione 6]");
		int Operacion = sc.nextInt();

		if (Operacion == 1) {
			Suma(Numero1, Numero2);

			System.out.println("El Resultado de la Operacion es -> " + Suma(Numero1, Numero2));
			for (int i = 0; i <= 10; i++) {
				System.out.println();
			}
			MenuPrincipal();

		}

		if (Operacion == 2) {
			Resta(Numero1, Numero2);

			System.out.println("El Resultado de la Operacion es -> " + Resta(Numero1, Numero2));
			for (int i = 0; i <= 10; i++) {
				System.out.println();
			}
			MenuPrincipal();
		}

		if (Operacion == 3) {
			Multiplicacion(Numero1, Numero2);

			System.out.println("El Resultado de la Operacion es -> " + Multiplicacion(Numero1, Numero2));
			for (int i = 0; i <= 10; i++) {
				System.out.println();
			}
			MenuPrincipal();
		}

		if (Operacion == 4) {
			Division(Numero1, Numero2);

			System.out.println("El Resultado de la Operacion es -> " + Division(Numero1, Numero2));
			for (int i = 0; i <= 10; i++) {
				System.out.println();
			}
			MenuPrincipal();
		}
			if (Operacion == 5) {
				RaizCuadrada(Numero1);

				System.out.println("El Resultado de la Operacion es -> " + RaizCuadrada(Numero1));
				for (int i = 0; i <= 10; i++) {
					System.out.println();
				}
				MenuPrincipal();

			}

			if (Operacion == 6) {
				Exponencial(Numero1, Numero2);

				System.out.println("El Resultado de la Operacion es -> " + Exponencial(Numero1, Numero2));
				for (int i = 0; i <= 10; i++) {
					System.out.println();
				}
				MenuPrincipal();
			}
				if (Operacion >= 7) {
					System.out.println("Funciona Elegida no valida, intentelo de nuevo");
					MenuPrincipal();
				}
			}
		
	

	static double Suma(double Numero1, double Numero2) {

		double Resultado = Numero1 + Numero2;

		return (Resultado);
	}

	static double Resta(double Numero1, double Numero2) {

		double Resultado = Numero1 - Numero2;

		return (Resultado);
	}

	static double Multiplicacion(double Numero1, double Numero2) {

		double Resultado = Numero1 * Numero2;

		return (Resultado);
	}

	static double Division(double Numero1, double Numero2) {

		double Resultado = Numero1 / Numero2;

		return (Resultado);
	}

	static double RaizCuadrada(double Numero1) {

		double Resultado = (Math.sqrt(Numero1));

		return (Resultado);
	}

	static double Exponencial(double Numero1, double Numero2) {

		double Resultado = Math.pow(Numero1, Numero2);

		return (Resultado);
	}

}
