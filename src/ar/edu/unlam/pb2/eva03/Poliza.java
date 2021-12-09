package ar.edu.unlam.pb2.eva03;

public class Poliza implements Comparable<Poliza>{
	private Integer numeroDePoliza;
	private Persona asegurado;
	private Double sumaAsegurada;
	private Double prima;
	private Double premio;
	private Boolean fueRobado;
	private Boolean tuvoAlgunAccidente;
	public Poliza(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima, Double premio) {
		super();
		this.numeroDePoliza = numeroDePoliza;
		this.asegurado = asegurado;
		this.sumaAsegurada = sumaAsegurada;
		this.prima = prima;
		this.premio = premio;
		this.fueRobado = fueRobado;
		this.tuvoAlgunAccidente = tuvoAlgunAccidente;
	}
	public Integer getNumeroDePoliza() {
		return numeroDePoliza;
	}
	public void setNumeroDePoliza(Integer numeroDePoliza) {
		this.numeroDePoliza = numeroDePoliza;
	}
	public Persona getAsegurado() {
		return asegurado;
	}
	public void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}
	public Double getSumaAsegurada() {
		return sumaAsegurada;
	}
	public void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}
	public Double getPrima() {
		return prima;
	}
	public void setPrima(Double prima) {
		this.prima = prima;
	}
	public Double getPremio() {
		return premio;
	}
	public void setPremio(Double premio) {
		this.premio = premio;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDePoliza == null) ? 0 : numeroDePoliza.hashCode());
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
		Poliza other = (Poliza) obj;
		if (numeroDePoliza == null) {
			if (other.numeroDePoliza != null)
				return false;
		} else if (!numeroDePoliza.equals(other.numeroDePoliza))
			return false;
		return true;
	}
	@Override
	public int compareTo(Poliza o) {
		return this.numeroDePoliza.compareTo(o.getNumeroDePoliza());
	}
	public boolean fueRobado() {
		return fueRobado;
	}
	public Boolean getFueRobado() {
		return fueRobado;
	}
	public void setFueRobado(Boolean fueRobado) {
		this.fueRobado = fueRobado;
	}
	
	public Boolean tuvoAlgunAccidente() {
		return tuvoAlgunAccidente;
	}

	public Boolean getTuvoAlgunAccidente() {
		return tuvoAlgunAccidente;
	}

	public void setTuvoAlgunAccidente(Boolean tuvoAlgunAccidente) {
		this.tuvoAlgunAccidente = tuvoAlgunAccidente;
	}
	
	
	
	
}
