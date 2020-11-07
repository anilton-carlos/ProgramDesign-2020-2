package br.edu.ufam.icomp.lab_encapsulamento;

public class Posicao {
	private double latitude, longitude, altitude;
	
	public Posicao(double latitude, double longitude, double altitude) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	
	public double getAltitude() {
		return altitude;
	}
	
	public String toString() {
		return "Posição: "
				+ Double.toString(latitude)
				+ ", "
				+ Double.toString(longitude)
				+ ", "
				+ Double.toString(altitude);
	}
}
