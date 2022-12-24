package trabalho1.poo;

import java.util.Scanner;

public class Exercicio14_17 {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int tamanhoP, l, j, t;
		
		System.out.println("Digite uma palavra com 5 letras: ");
		String palavra = entrada.nextLine();
		
		tamanhoP = palavra.length();
		
		for(l = 0; l < tamanhoP; l++)
			for(j= 0; j < tamanhoP;j++)
				for(t = 0; t< tamanhoP;t++) {
					if(l != j && l != t && j != t)
						System.out.printf("%c%c%c \n",palavra.charAt(l), palavra.charAt(j), palavra.charAt(t));
				}
	}
}