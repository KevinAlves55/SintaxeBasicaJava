import java.lang.Math;

public class Operadores {

	public static void main(String[] args) {
		
		int numA = 5;
		int numB = 2;
		
		// SOMA
		int totalSoma = numA + numB;	
		System.out.println(numA + " + " + numB + " = " + totalSoma);
		
		// SUBTRAÇÃO
		int totalSub = numA - numB;
		System.out.println(numA + " - " + numB + " = " + totalSub);
		
		// MULTIPLICAÇÃO
		int totalMult = numA * numB;
		System.out.println(numA + " x " + numB + " = " + totalMult);
		
		// DIVISÃO
		
		// Declaração de variáveis tudo em uma linha só, desde que elas tenham o mesmo principio
		int numDiv1, numDiv2, totalDiv;
		
		numDiv1 = 10;
		numDiv2 = 2;
		totalDiv = numDiv1 / numDiv2;
		
		System.out.println(numDiv1 + " / " + numDiv2 + " = " + totalDiv);
		
		// RESTO DA DIVISÃO (MOD)
		totalDiv = numDiv1 % numDiv2;
		
		System.out.println("Resto da divisão: " + totalDiv);
		
		// POTENCIAÇÃO
		double numPot1, numPot2, potencia;
		numPot1 = 10;
		numPot2 = 2;
		potencia = Math.pow(numPot1, numPot2);
		
		System.out.println("Exemplo de potencia: " + potencia);
		
		// RADICIAÇÃO (Quadrada)
		double raiz;
		raiz = Math.sqrt(121);
		
		System.out.println("Exemplo de raiz: " + raiz);
		
		// RADICIAÇÃO CÚBICA
		raiz = Math.cbrt(27);
		
		System.out.println("Exemplo de raiz cúbica: " + raiz);
	}

}
