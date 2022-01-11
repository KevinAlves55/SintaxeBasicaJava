package Carro;

class MetodosProtegidos {
	
	protected void exibirMensagem() {
		
		System.out.println("Olá mundo");
		
	}
	
	protected int soma(int x, int y) {
		
		int resultado = x + y;
		return resultado;
		
	}
	
	protected double calcularMedia(double x, double y) {
		
		double resultado = ((x + y) / 2);
		return resultado;
		
	}
	
	protected boolean logado() {
		
		boolean condicao = true;
		return condicao;
		
	}
	
	protected String exibirMensagemArgumento(String mensagem) {
		
		String resultado = "A mensagem é: " + mensagem;
		return resultado;
		
	}

}
