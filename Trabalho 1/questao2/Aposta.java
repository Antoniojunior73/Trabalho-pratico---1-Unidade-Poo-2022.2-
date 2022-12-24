package questao2;

//Classe para protrotipação de Apostas
public class Aposta {

	//Declaração de Varíaveis
	private Evento eventoA;
	private Resultado resultadoA;
	private double ValorApostado;
	
	//Construtor para classe Aposta
	public Aposta(Evento eventoA, Resultado resultadoA, double valorApostado) {
		this.eventoA = eventoA;
		this.resultadoA = resultadoA;
		this.ValorApostado = valorApostado;
	}
	
	/**  FUNÇÕES **/
	
	//Função para calcular o lucro do jogador
	public double calculaLucro(Evento quartasFinal1) {
		
		double lucro = 0;
		
		if(quartasFinal1.getResultado() == Resultado.TIME1)
			lucro = ValorApostado*quartasFinal1.getVencedor1();
		else if(quartasFinal1.getResultado() == Resultado.TIME2)
			lucro = ValorApostado*quartasFinal1.getVencedor2();
		else
			lucro = ValorApostado*quartasFinal1.getEmpate();
			
		return lucro;
	}

	/**  METODOS  GET e SET**/
	
	public Evento getEventoA() {
		return eventoA;
	}

	public void setEventoA(Evento eventoA) {
		this.eventoA = eventoA;
	}

	public Resultado getResultadoA() {
		return resultadoA;
	}

	public void setResultadoA(Resultado resultadoA) {
		this.resultadoA = resultadoA;
	}

	public double getValorApostado() {
		return ValorApostado;
	}

	public void setValorApostado(double valorApostado) {
		ValorApostado = valorApostado;
	}
}
