package Carro;

import java.util.Scanner;

public class TestaCarro {

	public static void main(String[] args) {
		
		Carro carroUm = new Carro();
		
		System.out.println("Nome do carro: " + carroUm.nome);
		System.out.println("Modelo: " + carroUm.modelo);
		System.out.println("Ano: " + carroUm.ano);
		
		carroUm.acelerar();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a kilometragem: ");
		int km = entrada.nextInt();
		
		System.out.println(carroUm.calcularConsumo(km));
		
		for (int i = 0 ; i < carroUm.acessorios.length ; i++) {
			
			System.out.println(carroUm.acessorios[i]);
		
		}

	}

}
