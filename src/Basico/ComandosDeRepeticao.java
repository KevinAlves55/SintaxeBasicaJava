package Basico;

public class ComandosDeRepeticao {

	public static void main(String[] args) {

		// while
		int contador = 1;

		while (contador <= 10) {

			System.out.println(contador);
			contador++;

		}

		// do while
		int contadorDois = 1;

		do {

			System.out.println(contadorDois);
			contadorDois++;

		} while (contadorDois <= 10);

		// for
		for (int x = 1; x <= 10; x++) {
			System.out.println(x);
		}

		// for com uso de String
		String[] frutas = { "Maçã", "Melão", "Banana", "Abacate" };

		for (int x = 0; x < frutas.length; x++) {

			System.out.println(frutas[x]);

		}

	}

}
