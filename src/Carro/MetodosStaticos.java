package Carro;

public class MetodosStaticos {
	
	public static void exibirMensagem() {
		
		System.out.println("Olá Mundo");
		
	}
	
	public static int soma(int x, int y) {
		
		int resultado = x + y;
		return resultado;
		
	}
	
	public static double calcularMedia(double x, double y) {
		
		double resultado = ((x + y) / 2);
		return resultado;
		
	}
	
	public static boolean logado() {
		
		boolean condicao = true;
		return condicao;
		
	}
	
	public static String exibirMensagemArgumento(String mensagem) {
		
		String resultado = "A mensagem é: " + mensagem;
		return resultado;
		
	}

	// Principal
	public static void main(String[] args) {
		
		exibirMensagem();
		System.out.println(soma(50, 100));
		System.out.println(calcularMedia(10, 10));
		System.out.println(logado());
		System.out.println(exibirMensagemArgumento("Olá Senai"));

	}

}
