package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SegurosDeVida {
	
	
	public void agregarBeneficiario(Persona hijo, TipoDeBeneficiario hijo2);

	public int obtenerCantidadDeBeneficiarios();

	public Object getAsegurado();

	public Double getPremio();
	
	
	
	
	
	
	
	
}
