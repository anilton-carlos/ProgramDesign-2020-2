package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.*;

public class CarroLuxuoso extends Carro implements Localizavel{
	public CarroLuxuoso(String placa) {
		super(placa);
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
		return 15.0;
	}
}