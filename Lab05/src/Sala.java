/**
 * Classe que representa uma sala de aula
 * 
 * @author Anilton Carlos; aclr@icomp.ufam.edu.br;
 *
 */
public class Sala {
	int bloco;
	int sala;
	int capacidade;
	boolean acessivel;
	/**
	 * Construtor da classe.
	 */
	Sala() {
		bloco = 0;
		sala = 0;
		capacidade = 0;
		acessivel = false;
	}
	/**
	 * Construtor da classe.
	 * @param bloco número do bloco onde se localiza a sala
	 * @param sala número da sala
	 * @param capacidade capacidade da sala
	 * @param acessivel acessibiidade da sala
	 */
	Sala(int bloco, int sala, int capacidade, boolean acessivel) {
		this.bloco = bloco;
		this.sala = sala;
		this.capacidade = capacidade;
		this.acessivel = acessivel;
	}
	/**
	 * Descrição da sala de aula
	 * @return String descrição
	 */
	String getDescricao() {
		String descricao = "Bloco " + Integer.toString(bloco) + ", Sala " + Integer.toString(sala) + " ("
				+ Integer.toString(capacidade) + " lugares, ";
		if (acessivel)
			descricao += "acessível)";
		else
			descricao += "não acessível)";
		
		return descricao;
	}
}
