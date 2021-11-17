package ar.edu.unlam.pb2.eva03;

public class Auto {

	private String marca;
	private String modelo;
	private Integer anio;
	private Double precio;
	
	public Auto( String marca, String modelo, Integer anio, Double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	

}
