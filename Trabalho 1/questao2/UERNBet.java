package questao2;

public class UERNBet {
	
	public static void main(String args[]){
		
		//Criação de Obejtos(Eventos)
		Evento quartasFinal1 = new Evento ("Quartas de final da copa do mundo", "Brasil", "Croácia", 1.18, 1.8, 2.5);
		Evento quartasFinal2 = new Evento ("Quartas de final da copa do mundo", "Argentina", "Holanda", 1.4, 1.5, 1.9);
		
		//Exibe o Evento(Objeto)
		quartasFinal1.MostrarEvento();
		
		//Criação de Obejtos(Apostas)
		Aposta aposta1 = new Aposta(quartasFinal1, Resultado.TIME1, 1000);
		Aposta aposta2 = new Aposta(quartasFinal1, Resultado.EMPATE, 400);
		Aposta aposta3 = new Aposta(quartasFinal1, Resultado.TIME2, 300);
		
		//Resultado do Evento
		quartasFinal1.setResultado(Resultado.EMPATE);
		
		//Resultado da Aposta do jogador
		if(aposta1.getResultadoA() == quartasFinal1.getResultado())
			System.out.println("O apostador ganhou R$ " + aposta1.calculaLucro(quartasFinal1));
		else
			System.out.println("O apostador perdeu R$ " + aposta1.getValorApostado());
	}
}



/**     LW     **/