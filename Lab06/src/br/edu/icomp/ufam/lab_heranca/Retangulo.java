package br.edu.icomp.ufam.lab_heranca;

public class Retangulo extends FormaGeometrica{
	public double largura, altura;
	
	public Retangulo(int posX, int posY, double largura, double altura){
		super(posX, posY);
		this.largura = largura;
		this.altura = altura;
	}
	
	public double getArea() {
		return this.altura * this.largura;
	}
	
	public double getPerimetro() {
		return 2 * (this.altura + this.largura);
	}
	
	public String toString() {
		return "Ret�ngulo na "
				+ getPosString()
				+ " com largura de "
				+ Double.toString(this.largura)
				+ "cm e altura de "
				+ Double.toString(this.altura)
				+ "cm (�rea="
				+ Double.toString(getArea())
				+ "cm2, per�metro="
				+ Double.toString(getPerimetro())
				+ "cm)";
	}
}
