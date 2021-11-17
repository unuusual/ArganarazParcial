package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PolizaDeAuto extends Poliza implements SegurosGenerales {
	private Auto autos;
	
	public PolizaDeAuto(int numeroPoliza, Persona asegurado, Double sumaAsegurada, Double prima, Double pREMIO) {
		super(numeroPoliza, asegurado, sumaAsegurada, prima, pREMIO);
		
	}
	
	public boolean fueRobado() {
		return true;
	}

	@Override
	public void agregarBienAsegurado(Auto auto) {
		this.autos = auto;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((autos == null) ? 0 : autos.hashCode());
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
		PolizaDeAuto other = (PolizaDeAuto) obj;
		if (autos == null) {
			if (other.autos != null)
				return false;
		} else if (!autos.equals(other.autos))
			return false;
		return true;
	}

	@Override
	public Auto getAuto() {
		return this.autos;
	}

	

	
	

}
