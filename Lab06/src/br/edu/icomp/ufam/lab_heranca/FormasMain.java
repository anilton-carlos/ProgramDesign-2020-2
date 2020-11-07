package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FormaGeometrica forma[] = new FormaGeometrica[3];
		Circulo circulo1 = new Circulo(32, 87, 6.0);
		Retangulo retangulo1 = new Retangulo(12, 65, 2.0, 7.0);
		Quadrado quadrado1 = new Quadrado(45, 39, 6.0);
		
		forma[0] = circulo1;
		forma[1] = retangulo1;
		forma[2] = quadrado1;
		
		for(int i = 0; i < 3; i++) {
			System.out.println(forma[i].toString());
		}
	}

}
