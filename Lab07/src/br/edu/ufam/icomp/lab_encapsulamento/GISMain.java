package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Localizavel localizacoes[] = new Localizavel[2];
		
		Celular celular1 = new Celular(55, 92, 991236043);
		CarroLuxuoso carro1 = new CarroLuxuoso("OAE-7987");
		
		localizacoes[0] = celular1;
		localizacoes[1] = carro1;
		
		for(int i = 0; i < localizacoes.length; i++) {
			System.out.println(localizacoes[i].getPosicao());
		}
	}

}
