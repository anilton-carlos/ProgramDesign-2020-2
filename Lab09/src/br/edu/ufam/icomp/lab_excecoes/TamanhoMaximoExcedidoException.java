package br.edu.ufam.icomp.lab_excecoes;

public class TamanhoMaximoExcedidoException extends RoverCaminhoException{
	private static final long serialVersionUID = 121L;
	
	public TamanhoMaximoExcedidoException() {
		this("Quantidade máxima de coordenadas excedida");
	}
	
	public TamanhoMaximoExcedidoException(String s) {
		super(s);
	}
}
