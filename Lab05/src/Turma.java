import java.util.*;

/**
 * Classe que representa uma turma.
 * 
 * @author Anilton Carlos; aclr@icomp.ufam.edu.br;
 *
 */
public class Turma {
	String nome;
	String professor;
	int numAlunos;
	boolean acessivel;
	ArrayList<Integer> horarios;

	Turma() {
		nome = "";
		professor = "";
		numAlunos = 0;
		acessivel = false;
		horarios = new ArrayList<Integer>();
	}

	Turma(String nome, String professor, int numAlunos, boolean acessivel) {
		this.nome = nome;
		this.professor = professor;
		this.numAlunos = numAlunos;
		this.acessivel = acessivel;
		horarios = new ArrayList<Integer>();
	}

	void addHorario(int horario) {
		horarios.add(horario);
	}

	private String conversaoHorario(int horario) {
		String saida = "";
		if (horario == 1 || horario == 8 || horario == 15 || horario == 22 || horario == 29) {
			saida += "8hs";
		} else if (horario == 2 || horario == 9 || horario == 16 || horario == 23 || horario == 30) {
			saida += "10hs";
		} else if (horario == 3 || horario == 10 || horario == 17 || horario == 24 || horario == 31) {
			saida += "12hs";
		} else if (horario == 4 || horario == 11 || horario == 18 || horario == 25 || horario == 32) {
			saida += "14hs";
		} else if (horario == 5 || horario == 12 || horario == 19 || horario == 26 || horario == 33) {
			saida += "16hs";
		} else if (horario == 6 || horario == 13 || horario == 20 || horario == 27 || horario == 34) {
			saida += "18hs";
		} else if (horario == 7 || horario == 14 || horario == 21 || horario == 28 || horario == 35) {
			saida += "20hs";
		}

		return saida;
	}

	String getHorariosString() {
		//horarios.sort(null);
		String saida = "";
		for (int i = 0; i < horarios.size(); i++) {
			if (horarios.get(i) < 8) {
				saida += "segunda " + conversaoHorario(horarios.get(i));
			} else if (horarios.get(i) < 15) {
				saida += "terça " + conversaoHorario(horarios.get(i));
			} else if (horarios.get(i) < 22) {
				saida += "quarta " + conversaoHorario(horarios.get(i));
			} else if (horarios.get(i) < 29) {
				saida += "quinta " + conversaoHorario(horarios.get(i));
			} else {
				saida += "sexta " + conversaoHorario(horarios.get(i));
			}
			
			if(i < horarios.size() - 1) {
				saida += ", ";
			}
		}

		return saida;
	}
	
	String getDescricao() {
		String descricao = "Turma: " + nome + "\nProfessor: " + professor + "\nNúmero de alunos: " + Integer.toString(numAlunos) + "\nHorário: " + getHorariosString() + "\nAcessível: ";
		if(acessivel) {
			descricao += "sim";
		} else {
			descricao += "não";
		}
		
		return descricao;
	}
	
}
