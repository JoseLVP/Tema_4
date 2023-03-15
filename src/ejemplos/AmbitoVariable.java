package ejemplos;

public class AmbitoVariable {
	
	public static int a = 5;
	
	
	public static void main(String[] args) {

		System.out.println("Estas son las funciones a las que estamos llamando ");
		Funcion1();
		System.out.println("El valor de a en el Main es -> " +a);
		
		
	}

	static void Funcion1() {

		int b = 3;

		while (a < 6) {

			int c = 7;

			System.out.println("Valor de a " + a + "\nValor de b " + b + "\nValor de c " + c);
			a++;
			b++;
			c++;
		}

	}

}
