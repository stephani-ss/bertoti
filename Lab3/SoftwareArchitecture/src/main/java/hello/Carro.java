package hello;

public class Carro {

	private String placa;
	private Especificacao espc;
	private String marca;
	
	
	public Carro(String placa, Especificacao espc){
		this.placa = placa;
		this.espc = espc;

		
	}
	
	public String getPlaca(){
		return this.placa;
	}
	
	public Especificacao getEspc(){
		return espc;
	}

	public Object getMarca() {
		
		return this.marca;
	}
	
	
}
