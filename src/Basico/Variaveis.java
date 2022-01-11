package Basico;

public class Variaveis {

	public static void main(String[] args) {
		
		// Exibir algo na tela sem pular uma linha
		// System.out.print("Teste sem o ln");
				
		// Exibir algo na tela
		// System.out.println("Olá mundo");
		
		/* Variaveis Interias */
		
		System.out.println("-- Declarações de números inteiros --");
		System.out.println("");
		
		// Declaração de variavel (Tipo nome = valor;)
		int valorInteiro = 1;
		System.out.println("Exemplo de concatenação int " + valorInteiro);
		
		// Descobrindo o menor valor que um tipo de declaração de variavel int pode guardar
		System.out.println("Menor valor de integer/int " + Integer.MIN_VALUE);
		System.out.println("Maior valor de integer/int " + Integer.MAX_VALUE);
		
		System.out.println("==============================================");
		
		// Declaração de variavel com long, usar o L no final, caso o valor seja muito grande
		long valorLong = 500000000;
		long valorLong2 = 5454567474546548L;
		long valorLong3 = 54564567486787878L;
		
		// Descobrindo o menor valor que um tipo de declaração de variavel long pode guardar
		System.out.println("Exemplo de long " + valorLong3);
		System.out.println("Menor valor de long " + Long.MIN_VALUE);
		System.out.println("Maior valor de long " + Long.MAX_VALUE);
		
		System.out.println("==============================================");
		
		// Declaração de variavel com short
		short valorShort = 10000;
		
		// Descobrindo o menor valor que um tipo de declaração de variavel long pode guardar
		System.out.println("Exemplo de short " + valorShort);
		System.out.println("Menor valor de short " + Short.MIN_VALUE);
		System.out.println("Maior valor de short " + Short.MAX_VALUE);
		
		System.out.println("==============================================");
		
		// Declaração de variavel com byte, e valorização depois do declaramento
		short valorByte;
		valorByte = 10;
				
		// Descobrindo o menor valor que um tipo de declaração de variavel byte pode guardar
		System.out.println("Exemplo de byte " + valorByte);
		System.out.println("Menor valor de byte " + Byte.MIN_VALUE);
		System.out.println("Maior valor de byte " + Byte.MAX_VALUE);
		
		System.out.println("");
		
		System.out.println("-- Declarações de números flutuantes --");
		
		/* Variaveis Flutuantes */
		
		System.out.println("==============================================");
		
		// Declaração de variavel com float
		float valorFloat = 100465.1536F;
				
		// Descobrindo o menor valor que um tipo de declaração de variavel float pode guardar
		System.out.println("Exemplo de float " + valorFloat);
		System.out.println("Menor valor de float " + Float.MIN_VALUE);
		System.out.println("Maior valor de float " + Float.MAX_VALUE);
		
		System.out.println("==============================================");
		
		// Declaração de variavel com double
		double valorDouble = 24577784588787454574.968;
						
		// Descobrindo o menor valor que um tipo de declaração de variavel double pode guardar
		System.out.println("Exemplo de double " + valorDouble);
		System.out.println("Menor valor de double " + Double.MIN_VALUE);
		System.out.println("Maior valor de double " + Double.MAX_VALUE);
		
		System.out.println("");
		
		System.out.println("-- Outros tipos de variaveis --");
		
		/* Outras variaveis */
		
		System.out.println("==============================================");
		
		// Declaração de variavel boleana
		boolean valorBoolean = true;
						
		// Exemplo de uso do Boolean, que retorna verdadeiro ou falso
		System.out.println("Exemplo de boolean " + valorBoolean);
		
		System.out.println("==============================================");
		char simbolo = 123;
		System.out.println("Exemplo de uso do Char " + simbolo);
		
		System.out.println("==============================================");
		String palavras = "Exemplo de uso de uma String que guarda uma cadeia de caracter";
		System.out.println(palavras);
	
	}

}
