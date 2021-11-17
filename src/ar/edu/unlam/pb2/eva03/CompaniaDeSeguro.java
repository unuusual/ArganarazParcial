package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CompaniaDeSeguro{
	private String nombre;
	private Integer numeroPoliza;
	private Set<Poliza> poliza;
	private Boolean fueRobado;

	

	
	public CompaniaDeSeguro(String nombre) {
		this.nombre = nombre;
		this.numeroPoliza = numeroPoliza;
		this.poliza = new TreeSet<Poliza>();
		this.fueRobado = fueRobado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

	public void agregarPoliza(Poliza poliza1){
		poliza.add(poliza1);
	}
	
	public void denunciarSiniestro(Integer numero) throws PolizaInexistente{
		Boolean seEncontro = false;
		
		for (Poliza i : poliza) {
			if (i.getNumeroDePoliza().equals(numero)) {
				this.fueRobado = true;
				seEncontro = true;
			} 
		}
		if(!seEncontro){
			throw new PolizaInexistente();
		}
			
		
	}
	

	public Integer obtenerLaCantidadDePolizasEmitidas() {
		return poliza.size();
	}
	
	

	public Poliza getPoliza(int numero) throws PolizaInexistente{
		for (Poliza i : poliza) {
			if (i.getNumeroDePoliza().equals(numero)) {
			return i;	
			}
			
		}
		
		return null;
		
	}

	public void setPoliza(Set<Poliza> poliza) {
		this.poliza = poliza;
	}

	public Integer getNumeroPoliza() {
		return numeroPoliza;
	}

	public void setNumeroPoliza(Integer numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroPoliza == null) ? 0 : numeroPoliza.hashCode());
		result = prime * result + ((poliza == null) ? 0 : poliza.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompaniaDeSeguro other = (CompaniaDeSeguro) obj;
		if (numeroPoliza == null) {
			if (other.numeroPoliza != null)
				return false;
		} else if (!numeroPoliza.equals(other.numeroPoliza))
			return false;
		if (poliza == null) {
			if (other.poliza != null)
				return false;
		} else if (!poliza.equals(other.poliza))
			return false;
		return true;
	}

	



	
	

	
	
	

}
