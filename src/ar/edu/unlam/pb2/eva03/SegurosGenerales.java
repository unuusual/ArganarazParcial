package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.List;

public interface SegurosGenerales {
	
	

	public void agregarBienAsegurado(Auto auto);

	public Integer getNumeroDePoliza();

	public Auto getAuto();

	public Persona getAsegurado();

	public Double getPremio();

	
	
	
	
}
