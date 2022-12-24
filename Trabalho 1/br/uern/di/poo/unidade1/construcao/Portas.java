package br.uern.di.poo.unidade1.construcao;

//Enumeração para criar os tipos de porta
public enum Portas {
	
	/** TIPOS  **/
	
	SIMPLES("Madeira compensada", "Fechadura simples", 50),
	PADRAO("Madeira andiroba", "Fechadura de encaixe", 140),
	LUXO("Madeira ipê", "Fechadura tetra", 350);
	
	//Declaração de Varíaveis
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
