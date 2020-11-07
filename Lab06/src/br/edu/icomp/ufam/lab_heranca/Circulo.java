package br.edu.icomp.ufam.lab_heranca;

public class Circulo extends FormaGeometrica{
	public double raio;
	
	public Circulo(int posX, int posY, double raio){
		super(posX,posY);
		this.raio = raio;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(raio, 2);
	}
	
	public double getPerimetro() {
		return 2.0 * Math.PI * raio;
	}
	
	public String toString() {
		return "Círculo na "
				+ getPosString()
				+ " com raio de "
				+ Double.toString(raio)
				+ "cm (área="
				+ Double.toString(getArea())
				+ "cm2, perímetro="
				+ Double.toString(getPerimetro())
				+ "cm)";
	}
}
