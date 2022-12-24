package br.uern.di.poo.unidade1.construcao;

//Classe para calcular o servi�o de instala��o
public class Servico {
	
	//Declara��o de Constantes
	final  static double LUXO = 1.1; //Coloquei 1.1, pois � um acrescimo ao valor total, ent�o j� realizei 100% + 10% de forma direta;
	final  static double INSTALACAO = 70.0;
	final  static double INSTALACAOPI = 250.0;
	
	//Fun��o para calcular o Servi�o de instala��o da porta
	public static void calculaServico(Porta portaS) {
		
		double metros = portaS.getAltura() * portaS.getLargura();
		double valorI = 0.0;
		
		if(portaS.isPivote() == true) {
			valorI = (metros * INSTALACAO)+ INSTALACAOPI;
			if(portaS.getTipo() == Portas.LUXO)
				valorI = (metros * INSTALACAO + INSTALACAOPI)*LUXO;
		}
		else if(portaS.getTipo() == Portas.LUXO)
			valorI = (metros*INSTALACAO)*LUXO;
		else
			valorI = metros*INSTALACAO;
		
		System.out.println("___________________________________________\n");
		System.out.printf("O Valor da instala��o da porta �: R$%.2f\n", valorI);
		System.out.println("___________________________________________\n");
	}
	
}
