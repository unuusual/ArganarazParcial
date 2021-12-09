package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PolizaAccidentesPersonales extends Poliza implements SegurosDeVida {
	private Map<Persona, TipoDeBeneficiario> persona;
	private TipoDeBeneficiario tipoBeneficiario;

	
	public PolizaAccidentesPersonales(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima, Double premio) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima, premio);
		this.persona = new HashMap<Persona, TipoDeBeneficiario>();

	}
	


	@Override
	public void agregarBeneficiario(Persona hijo, TipoDeBeneficiario hijo2) {
		persona.put(hijo, hijo2);
	}

	@Override
	public int obtenerCantidadDeBeneficiarios() {
		return persona.size();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((persona == null) ? 0 : persona.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PolizaAccidentesPersonales other = (PolizaAccidentesPersonales) obj;
		if (persona == null) {
			if (other.persona != null)
				return false;
		} else if (!persona.equals(other.persona))
			return false;
		return true;
	}
	
	

}
