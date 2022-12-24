package br.uern.di.poo.unidade1.construcao;

//Classe para calcular o serviço de instalação
public class Servico {
	
	//Declaração de Constantes
	static final double LUXO = 1.1; //Coloquei 1.1, pois é um acrescimo ao valor total, então já realizei 100% + 10% de forma direta;
	static final double INSTALACAO = 70.0;
	static final double INSTALACAOPI = 250.0;
	
	//Função para calcular o Serviço de instalação da porta
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
		System.out.printf("O Valor da instalação da porta é: R$%.2f\n", valorI);
		System.out.println("___________________________________________\n");
	}
	
}
