package br.edu.ufam.icomp.lab_excecoes;

public class RoverCaminhoException extends RoverException{
	private static final long serialVersionUID = 12L;
	
	public RoverCaminhoException() {
		this("Exceção geral de caminho do rover");
	}
	
	public RoverCaminhoException(String s) {
		super(s);
	}
}
