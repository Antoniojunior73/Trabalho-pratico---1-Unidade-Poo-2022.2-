package br.uern.di.poo.unidade1.construcao;

//Classe para protrotipação da Porta
public class Porta {

	//Declaração de Varíaveis
	private Portas tipo;
	private double largura, altura;
	private boolean pivote;
	private double valor;
	
	//Declaração de Constantes
	final private int PIVOTANTE = 350;
	final private double LARGURA = 0.70;
	final private double ALTURA = 1.8;
	
	/** CONSTRUTORES  **/
	
	//Construtor1 (Vazio)
	public Porta() {
		this.tipo = Portas.SIMPLES;
		this.largura = LARGURA;
		this.altura = ALTURA;
		this.pivote = false;
	}

	//Construtor2
	public Porta(Portas tipo, double largura, double altura, boolean pivote) {
		this.tipo = tipo;
		this.largura = largura;
		this.altura = altura;
		this.pivote = pivote;
	}
	
	/** FUNÇÕES  **/

	//Função para calcular o preço de uma porta por m2
	public double calculaPreco() {
		double metros = largura * altura;
		
		if(tipo == Portas.SIMPLES)
			valor = metros*50;
		else if(tipo == Portas.PADRAO)
			valor = metros*140;
		else if(tipo == Portas.LUXO)
			valor = metros*350;
		return valor;
	}
	
	//Função para exibir as caracteristicas da porta
	public void exibePorta() {
		System.out.println("----- Informações sobre a Porta -----");
		System.out.println("Tipo da Porta " + this.tipo);
		System.out.println("Largura da Porta: " + this.largura);
		System.out.println("Altura da Porta: " + this.altura);
		System.out.println("A Porta é Pivotante: " + this.pivote);
		System.out.printf("O valor da porta R$: %.2f\n", calculaPreco());
		System.out.println("-------------------------------------");
	}
	
	/**  METODOS GET E SET  **/
	public Portas getTipo() {
		return tipo;
	}

	public void setTipo(Portas tipo) {
		this.tipo = tipo;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public boolean isPivote() {
		return pivote;
	}

	public void setPivote(boolean pivote) {
		this.pivote = pivote;
	}

	public int getPIVOTANTE() {
		return PIVOTANTE;
	}

	public double getLARGURA() {
		return LARGURA;
	}

	public double getALTURA() {
		return ALTURA;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
