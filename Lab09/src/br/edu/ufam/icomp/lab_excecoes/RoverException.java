package br.edu.ufam.icomp.lab_excecoes;
import java.io.FileNotFoundException;

public class RoverException extends FileNotFoundException{
	private static final long serialVersionUID = 1L;
	
	public RoverException() {
		this("Exceção geral do rover");
	}
	
	public RoverException(String s) {
		super(s);
	}
}
