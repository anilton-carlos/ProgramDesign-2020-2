package br.edu.ufam.icomp.lab_excecoes;

public class CoordenadaForaDosLimitesException extends RoverCoordenadaException{
	private static final long serialVersionUID = 112L;
	public CoordenadaForaDosLimitesException() {
		this("Coordenada com valores fora dos limites");
	}
	
	public CoordenadaForaDosLimitesException(String s) {
		super(s);
	}
}
