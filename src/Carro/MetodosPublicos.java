package Carro;

public class MetodosPublicos {

	public void exibirMensagem() {
		
		System.out.println("Olá mundo");
		
	}
	
	public int soma(int x, int y) {
		
		int resultado = x + y;
		return resultado;
		
	}
	
	public double calcularMedia(double x, double y) {
		
		double resultado = ((x + y) / 2);
		return resultado;
		
	}
	
	public boolean logado() {
		
		boolean condicao = true;
		return condicao;
		
	}
	
	public String exibirMensagemArgumento(String mensagem) {
		
		String resultado = "A mensagem é: " + mensagem;
		return resultado;
		
	}
	
	public void main(String[] args) {
		
		MetodosPublicos meuMetodo = new MetodosPublicos();
		meuMetodo.exibirMensagem();

	}

}
