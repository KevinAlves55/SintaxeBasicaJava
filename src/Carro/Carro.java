package Carro;

public class Carro {

	// Atributos da classe
	public String nome = "Opala";
	public String modelo = "Opala Diplomata Coupe 1987";
	public int ano = 1987;
	String[] acessorios = {
        
		"Faróis de LED", 
		"Suporte para o celular", 
		"Bagageiro de teto cromado",
		"Calota Gran Luxo" 
	
	};
	
	// Funções dessa classe
	
	public void acelerar() {
		
		System.out.println("Vruuummm");
		
	}
	
	public double calcularConsumo(double km) {
		
		return km / 6.61;
		
	}

}
