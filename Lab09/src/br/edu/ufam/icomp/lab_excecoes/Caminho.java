package br.edu.ufam.icomp.lab_excecoes;

public class Caminho{
	private Coordenada[] caminho;
	private int tamanho;
	
	public Caminho(int maxTam){
		caminho = new Coordenada[maxTam];
		this.tamanho = 0;
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException {
		if(this.tamanho >= this.caminho.length) {
			throw new TamanhoMaximoExcedidoException();
		}
		else {
			if(this.tamanho != 0) {
				double distancia = this.caminho[this.tamanho() - 1].distancia(coordenada);
				if(distancia > 15.0) {
					throw new DistanciaEntrePontosExcedidaException();
				}
			}
			this.caminho[this.tamanho++] = coordenada;
		}
	}
	
	public void reset() {
		while(this.tamanho > 0 ) {
			this.caminho[this.tamanho--] = null;
		}
	}
	
	public String toString() {
		String saida = "Dados do caminho:\n" + 
				"  - Quantidade de pontos: " +
				Integer.toString(this.tamanho) + "\n" +
				"  - Pontos:";
		
		for(int i = 0; i < this.tamanho; i++) {
			saida += "\n    -> " + this.caminho[i].toString();
		}
		
		return saida;
	}
}
