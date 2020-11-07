package br.edu.ufam.icomp.lab_encapsulamento;
import java.util.*;

public class Celular implements Localizavel{
	private int codPais, codArea, numero;
	
	public Celular(int codPais, int codArea, int numero) {
		super();
		if(codPais >= 1 && codPais <= 1999) {
			this.codPais = codPais;
		} else
			this.codPais = -1;
		
		if(codArea >= 10 && codArea <= 99) {
			this.codArea = codArea;
		} else 
			this.codArea = -1;
		
		if(numero >= 10000000 && numero <= 999999999) {
			this.numero = numero;
		} else
			this.numero = -1;
	}
	
	public final void setCodPais(int codPais) {
		if(codPais >= 1 && codPais <= 1999) {
			this.codPais = codPais;
		} else
			this.codPais = -1;
	}
	
	public int getCodPais() {
		return codPais;
	}
	
	public final void setCodArea(int codArea) {
		if(codArea >= 10 && codArea <= 99) {
			this.codArea = codArea;
		} else 
			this.codArea = -1;
	}
	
	public int getCodArea() {
		return codArea;
	}
	
	public final void setNumero(int numero) {
		if(numero >= 10000000 && numero <= 999999999) {
			this.numero = numero;
		} else
			this.numero = -1;
	}
	
	public int getNumero() {
		return numero;
	}
	
	private double valorRandom(double valorMin, double valorMax) {
		Random r = new Random();
		return valorMin + (valorMax - valorMin) * r.nextDouble();
	}
	
	public Posicao getPosicao() {
		double latitude = valorRandom(-3.16, -2.96);
		double longitude = valorRandom(-60.12, -59.82);
		double altitude = valorRandom(15.0, 100.0);
		
		Posicao posicao = new Posicao(latitude, longitude, altitude);
		return posicao;
	}
	
	public double getErroLocalizacao() {
		return 50.0;
	}
}
