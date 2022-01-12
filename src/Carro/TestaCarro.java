package Carro;

import java.util.Scanner;
import Basico.protegidos.*;

public class TestaCarro extends MetodosProtegidos {

	public static void main(String[] args) {
		
		Carro carroUm = new Carro();
		TestaCarro teste = new TestaCarro();
		
		System.out.println(teste.calcularMedia(10, 10));
		teste.exibirMensagem();
		
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
