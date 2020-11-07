package br.edu.ufam.icomp.lab_excecoes;

public class DistanciaEntrePontosExcedidaException extends RoverCaminhoException{
	private static final long serialVersionUID = 122L;
	
	public DistanciaEntrePontosExcedidaException() {
		this("Distância máxima entre duas coordenadas vizinhas excedida");
	}
	
	public DistanciaEntrePontosExcedidaException(String s) {
		super(s);
	}
}
