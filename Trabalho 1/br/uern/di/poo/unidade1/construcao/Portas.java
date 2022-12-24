package br.uern.di.poo.unidade1.construcao;

//Enumera��o para criar os tipos de porta
public enum Portas {
	
	/** TIPOS  **/
	
	SIMPLES("Madeira compensada", "Fechadura simples", 50),
	PADRAO("Madeira andiroba", "Fechadura de encaixe", 140),
	LUXO("Madeira ip�", "Fechadura tetra", 350);
	
	//Declara��o de Var�aveis
	private final String material, fechadura;
	private final int valorM;
	
	//Construtor
	private Portas(String material, String fechadura, int valorM) {
		this.material = material;
		this.fechadura = fechadura;
		this.valorM = valorM;
	}
	
	/** METODOS GET **/
	
	public String getMaterial() {
		return material;
	}

	public String getFechadura() {
		return fechadura;
	}

	public int getValorM() {
		return valorM;
	}
}
