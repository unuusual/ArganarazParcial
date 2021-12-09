	package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CompaniaDeSeguro{
	private String nombre;
	private Integer numeroPoliza;
	private Set<Poliza> poliza;

	

	
	public CompaniaDeSeguro(String nombre) {
		this.nombre = nombre;
		this.numeroPoliza = numeroPoliza;
		this.poliza = new TreeSet<Poliza>();
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
	
	public void denunciarSiniestro(Integer numero) throws PolizaNoExiste{
		Boolean seEncontro = false;
		
		for (Poliza i : poliza) {//recorro la lista de poliza
			if (i.getNumeroDePoliza().equals(numero)) { //si el numero de poliza que tiene la lisa										//coincide con el numero que le paso por parametro
				i.setFueRobado(true);
				i.setTuvoAlgunAccidente(true);
				seEncontro = true;// y lo encontraron
			} 
		}
		if(!seEncontro){
			throw new PolizaNoExiste(); 
			//lanzame la excepcion             //si no lo reconoce, la lista es inexistente
		}
			
		
	}
	

	public Integer obtenerLaCantidadDePolizasEmitidas() {	
		return poliza.size();
	}
	
	
//ESTE GET ME VA A TRAER LA POLIZA EN LA POSICION DEL NUMERO Q LE
	//MANDE POR PARAMETROS
	public Poliza getPoliza(int numero) throws PolizaNoExiste{ //aca ayudo el profe
		for (Poliza i : poliza) {//recorro poliza
			if (i.getNumeroDePoliza().equals(numero)) { //Si el contador es igual al numero que le mande
			return i;	//entonces devuelve ese contador
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
	
	

	



	
	

	
	
	

}
