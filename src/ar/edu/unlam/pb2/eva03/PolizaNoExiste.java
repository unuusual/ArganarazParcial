package ar.edu.unlam.pb2.eva03;

public class PolizaNoExiste extends Exception {
	public PolizaNoExiste() {
		super("La poliza no existe");
	}
}
