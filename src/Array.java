import java.util.Random;

public class Array {

	public static void main(String[] args) {

		// Array de String
		String[] nomes = {"Arthur", "Fernando", "Camila", "Paula"};
		
		for (int i = 0 ; i < nomes.length ; i++) {
			System.out.println(nomes[i]);
		}
		
		// Array de doubles
		double[] decimais = new double[10];
		
		for (int i = 0 ; i < decimais.length ; i++) {
			
			decimais[i] = i + 1; 
			System.out.println(decimais[i]);
		
		}
		
		// Array de inteiros aleatório
		Random geraNumero = new Random();
		
		int[] inteirosAleatorios = new int[10];
		
		for (int i = 0 ; i < inteirosAleatorios.length ; i ++) {
			
			inteirosAleatorios[i] = geraNumero.nextInt(20);
			System.out.println(inteirosAleatorios[i]);
			
		}
		
		// Array bidimensional tipo matriz
		int[][] matrizDeInteiros = {
				
				{1, 2, 3},
				{5, 6, 2},
				{21, 45, 66},
				
		};
		
		for (int linha = 0 ; linha < matrizDeInteiros.length ; linha++) {
			
			for (int coluna = 0 ; coluna < matrizDeInteiros[linha].length ; coluna++) {
				
				System.out.print(matrizDeInteiros[linha][coluna]);
			
			}
			
			System.out.println("");
		
		}
		
		System.out.println("Tamanho da linha 1: " + matrizDeInteiros[0].length);
		System.out.println("Tamanho da linha 2: " + matrizDeInteiros[1].length);
		System.out.println("Tamanho da linha 3: " + matrizDeInteiros[2].length);
		
	}

}
