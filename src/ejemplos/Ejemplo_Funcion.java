package ejemplos;

public class Ejemplo_Funcion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Primera llamada a tresSaludos");
		tresSaludos();
		System.out.println("Segunda llamada a tresSaludos");
		tresSaludos();
		System.out.println("Tercera llamada a tresSaludos");
		tresSaludos();
		
		Despedida();
	}

	
	
	static void tresSaludos() {

		System.out.println("...");
		for (int i = 1; i <= 3; i++) {
			System.out.println("**Hola**");
		}
	}

	static void Despedida () {
		
		System.out.println("...");
		System.out.println("Adios");
	}	
	
}
