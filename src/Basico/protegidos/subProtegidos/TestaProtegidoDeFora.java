package Basico.protegidos.subProtegidos;

import Basico.protegidos.MetodosProtegidos;

public class TestaProtegidoDeFora extends MetodosProtegidos {

	public static void main(String[] args) {
		
		TestaProtegidoDeFora objetoTestaFora = new TestaProtegidoDeFora();
		
		System.out.println(objetoTestaFora.calcularMedia(10, 5));
	
	}

}
