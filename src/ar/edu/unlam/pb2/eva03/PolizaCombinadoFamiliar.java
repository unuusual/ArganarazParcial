package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PolizaCombinadoFamiliar extends Poliza implements SegurosDeVida{

	
	private TipoDeBeneficiario tipoBeneficiario;
	private Map<Persona, TipoDeBeneficiario> persona;
	private List<Vivienda> casa;
	
	public PolizaCombinadoFamiliar(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima,
			Double premio) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima, premio);
		this.casa = new ArrayList<Vivienda>();
		this.persona = new HashMap<Persona, TipoDeBeneficiario>();
	}
	
	
	public void agregarBeneficiario(Persona hijo, TipoDeBeneficiario hijo2) {
		persona.put(hijo, hijo2);
	}
	
	public int obtenerCantidadDeBeneficiario() {
		return this.persona.size();
	}
	public void agregarBienAsegurado(Vivienda casa2) {
		casa.add(casa2);
	}


	@Override
	public int obtenerCantidadDeBeneficiarios() {
		return persona.size();
	}
	
	
	

}
