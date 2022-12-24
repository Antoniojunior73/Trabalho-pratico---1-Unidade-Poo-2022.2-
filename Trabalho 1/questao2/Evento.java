package questao2;

//Classe para protrotipação de Eventos
public class Evento {

	//Declaração de Varíaveis
	private String titulo, Time1, Time2;
	private double Vencedor1, Vencedor2, Empate;
	private Resultado Resultado;
	
	//Construtor para Classe Evento
	public Evento(String titulo, String time1, String time2, double vencedor1, double empate, double vencedor2) {
		
		this.titulo = titulo;
		this.Time1 = time1;
		this.Time2 = time2;
		this.Vencedor1 = vencedor1;
		this.Vencedor2 = vencedor2;
		this.Empate = empate;
	}
	
	/**  FUNÇÕES **/
	
	//Função para Exibir o evento
	public void MostrarEvento() {
		System.out.println("_______________ COPA DO MUNDO 2022 _______________\n");
		System.out.println("                 QUARTAS DE FINAL                  \n");
		System.out.println("         "+ Time1 + " Vs " + Time2 + "          \n");
		System.out.println("Cotação para o jogo de hoje:");
		System.out.println("Time 1 Vencedor ("+ Time1 + "): "+ Vencedor1);
		System.out.println("Time 2 Vencedor ("+ Time2 + "): "+ Vencedor2);
		System.out.println("Em caso de empate: "+ Empate+"\n");
		System.out.println("-------------------------------------------------- ");
		
	}
	
	/**  METODOS  GET e SET**/
	
	public Evento(Resultado resultado) {
		this.Resultado = resultado;
	}
	
	public Resultado getResultado() {
		return Resultado;
	}

	public void setResultado(Resultado resultado) {
		Resultado = resultado;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTime1() {
		return Time1;
	}

	public void setTime1(String time1) {
		Time1 = time1;
	}

	public String getTime2() {
		return Time2;
	}

	public void setTime2(String time2) {
		Time2 = time2;
	}

	public double getVencedor1() {
		return Vencedor1;
	}

	public void setVencedor1(int vencedor1) {
		Vencedor1 = vencedor1;
	}

	public double getVencedor2() {
		return Vencedor2;
	}

	public void setVencedor2(int vencedor2) {
		Vencedor2 = vencedor2;
	}

	public double getEmpate() {
		return Empate;
	}

	public void setEmpate(int empate) {
		Empate = empate;
	}

}
