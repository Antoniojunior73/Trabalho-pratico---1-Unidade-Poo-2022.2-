package br.uern.di.poo.unidade1.construcao;

public class Main {
	
	public static void main(String[] args) {
		
		/** CRIAÇÃO DE OBJETOS DE PORTA  **/
		
		Porta pedido1 = new Porta();
		Porta pedido2 = new Porta(Portas.LUXO, 0.6, 2.5, true);
		Porta pedido3 = new Porta(Portas.LUXO, 0.7,3.0, false);
		Porta pedido4 = new Porta(Portas.PADRAO, 0.5, 1.89, true);
		
		/** MOSTRAR: CARACTERISTICAS DA PORTA, PREÇO E VALOR DO SERVIÇO PARA INSTALAÇÃO  **/
		
		pedido1.exibePorta();
		Servico.calculaServico(pedido1);
		pedido2.exibePorta();
		Servico.calculaServico(pedido2);
		pedido3.exibePorta();
		Servico.calculaServico(pedido3);
		pedido4.exibePorta();
		Servico.calculaServico(pedido4);
		
	}

}



/**     LW     **/