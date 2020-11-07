package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] inPosX = new Integer[10];
		Integer[] inPosY = new Integer[10];
		Integer[] inDigi = new Integer[10];
		inPosX[0] = 32; inPosY[0] = 30; inDigi[0] = 2;
		inPosX[1] = 35; inPosY[1] = 40; inDigi[1] = 5;
		inPosX[2] = 38; inPosY[2] = 30; inDigi[2] = 8;
		inPosX[3] = 30; inPosY[3] = 36; inDigi[3] = 6;
		inPosX[4] = 40; inPosY[4] = 36; inDigi[4] = 6;
		inPosX[5] = 33; inPosY[5] = 31; inDigi[5] = 4;
		inPosX[5] = 200; inPosY[5] = 200; inDigi[5] = 0;
		
		Caminho caminho = new Caminho(6);
		
		for(int i = 0; i < 7; i++) {
			
			try {
				Coordenada coordenada = new Coordenada(inPosX[i], inPosY[i], inDigi[i]);
				caminho.addCoordenada(coordenada);
			}
			catch (CoordenadaNegativaException e) {
				System.out.println(e);
				caminho.reset();
			}
			catch (CoordenadaForaDosLimitesException e) {
				System.out.println(e);
				caminho.reset();
			}
			catch (DigitoInvalidoException e) {
				System.out.println(e);
				caminho.reset();
			}
			catch (TamanhoMaximoExcedidoException e) {
				System.out.println(e);
				caminho.reset();
			}
			catch (DistanciaEntrePontosExcedidaException e) {
				System.out.println(e);
				caminho.reset();
			}
		}
		
		System.out.println(caminho.toString());
	}

}
