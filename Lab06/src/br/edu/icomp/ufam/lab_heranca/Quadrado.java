package br.edu.icomp.ufam.lab_heranca;

public class Quadrado extends Retangulo{
	public Quadrado(int posX, int posY, double lado){
		super(posX, posY, lado, lado);
	}
	
	public String toString() {
		return "Quadrado na "
				+ getPosString()
				+ " com lado de "
				+ Double.toString(altura)
				+ "cm (área="
				+ Double.toString(getArea())
				+ "cm2, perímetro="
				+ Double.toString(getPerimetro())
				+ "cm)";
	}
}
