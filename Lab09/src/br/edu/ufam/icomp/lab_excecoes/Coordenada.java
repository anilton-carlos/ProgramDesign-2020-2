package br.edu.ufam.icomp.lab_excecoes;

public class Coordenada {
	private int posX, posY, digito;
	
	public Coordenada(int posX, int posY, int digito) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException{
		if(posX < 0 || posY < 0) throw new CoordenadaNegativaException();
		
		if(posX > 30000 || posY > 30000) throw new CoordenadaForaDosLimitesException();
		
		this.posX = posX;
		this.posY = posY;
		
		int resto = (posX + posY) % 10;
		
		if(resto != digito || resto < 0 || resto > 9) throw new DigitoInvalidoException();
		
		this.digito = digito;
		
	}
	
	public int getPosX() {
		return this.posX;
	}
	
	public int getPosY() {
		return this.posY;
	}
	
	public double distancia(Coordenada coordenada) {
		int argPosX = coordenada.getPosX();
		int argPosY = coordenada.getPosY();
		
		double dist = Math.pow((this.posX - argPosX), 2) + Math.pow((this.posY - argPosY), 2);
		dist = Math.sqrt(dist);
		
		return dist;
	}
	
	public String toString() {
		return Integer.toString(this.posX)
				+ ", "
				+ Integer.toString(this.posY);
	}
}
