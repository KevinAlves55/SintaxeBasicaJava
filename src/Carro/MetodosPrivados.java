package Carro;

public class MetodosPrivados {
	
	private void exibirMensagem() {
		
		System.out.println("Olá mundo");
		
	}
	
	private int soma(int x, int y) {
		
		int resultado = x + y;
		return resultado;
		
	}
	
	private double calcularMedia(double x, double y) {
		
		double resultado = ((x + y) / 2);
		return resultado;
		
	}
	
	private boolean logado() {
		
		boolean condicao = true;
		return condicao;
		
	}
	
	private String exibirMensagemArgumento(String mensagem) {
		
		String resultado = "A mensagem é: " + mensagem;
		return resultado;
		
	}

	public static void main(String[] args) {
		
		

	}

}
