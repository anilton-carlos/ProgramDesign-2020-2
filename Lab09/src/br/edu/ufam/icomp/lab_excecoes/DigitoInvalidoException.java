package br.edu.ufam.icomp.lab_excecoes;

public class DigitoInvalidoException extends RoverCoordenadaException{
	private static final long serialVersionUID = 113L;
	public DigitoInvalidoException() {
		this("Digito da coordenada inv�lido");
	}
	
	public DigitoInvalidoException(String s) {
		super(s);
	}
}
