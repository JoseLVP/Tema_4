package ejemplos;

public class Ejemplo_Sobrecarga_Funciones {

	public static void main(String[] args) {

		// ***SOBRECARGA DE FUNCIONES

		double a = 0, b = 0, c = 0;

		comparar(); // Llamamos al metodo 0

		int Respuesta = comparar((int) a, (int) b);
		System.out.println(Respuesta);
		boolean Respuesta2 = comparar((int) a, (int) b, (int) c);
		System.out.println(Respuesta2);

	}

	static void comparar() { //metodo 0
		
		System.out.println("Es una prueba");

	}

	static int comparar(int a, int b) { //metodo 1

		return 0;
	}

	static boolean comparar(int a, int b, int c) { //
		
		return true;

	}

}
